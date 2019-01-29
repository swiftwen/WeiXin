package com.aitravelba.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.aitravelba.common.req.PageQueryReq;
import com.aitravelba.common.resp.BaseResponse;
import com.aitravelba.common.resp.ResponseCode;
import com.aitravelba.dto.req.wechat.BackVoucherReqDto;
import com.aitravelba.dto.req.wechat.OrderListReqDto;
import com.aitravelba.dto.req.wechat.QueryPayInfoReqDto;
import com.aitravelba.dto.req.wechat.RegisterUserReqDto;
import com.aitravelba.dto.req.wechat.VoucherListReqDto;
import com.aitravelba.dto.resp.baidu.GeneralBasicRespDto;
import com.aitravelba.dto.resp.baidu.WordResultDto;
import com.aitravelba.dto.resp.wechat.AuthRespDto;
import com.aitravelba.dto.resp.wechat.OrderListDto;
import com.aitravelba.dto.resp.wechat.OrderListRespDto;
import com.aitravelba.dto.resp.wechat.QueryNoticeRespDto;
import com.aitravelba.dto.resp.wechat.QueryPayInfoRespDto;
import com.aitravelba.dto.resp.wechat.VoucherDto;
import com.aitravelba.dto.resp.wechat.VoucherListRespDto;
import com.aitravelba.orm.wechat.SmNoticeMapper;
import com.aitravelba.orm.wechat.SmOrderMapper;
import com.aitravelba.orm.wechat.SmPayInfoMapper;
import com.aitravelba.orm.wechat.SmTodayPriceMapper;
import com.aitravelba.orm.wechat.SmUserMapper;
import com.aitravelba.orm.wechat.SmVoucherMapper;
import com.aitravelba.pojo.wechat.SmNotice;
import com.aitravelba.pojo.wechat.SmOrder;
import com.aitravelba.pojo.wechat.SmPayInfo;
import com.aitravelba.pojo.wechat.SmTodayPrice;
import com.aitravelba.pojo.wechat.SmUser;
import com.aitravelba.pojo.wechat.SmVoucher;
import com.aitravelba.pojo.wechat.SmVoucherEx;
import com.aitravelba.service.WeChatService;
import com.aitravelba.util.BaiDuPicRecognizeUtil;
import com.aitravelba.util.DateUtil;
import com.aitravelba.util.ResponseUtil;
import com.alibaba.fastjson.JSONObject;
/**
 * 
 * @author swiftwen
 * @date 2019年1月24日 下午3:07:00
 */
@Service
public class WeChatServiceImpl implements WeChatService {

	private static final Logger logger = LoggerFactory.getLogger(WeChatServiceImpl.class);
	
	@Autowired
	private SmOrderMapper orderMapper;
	
	@Autowired
	private SmPayInfoMapper payInfoMapper;
	
	@Autowired
	private SmVoucherMapper voucherMapper;
	
	@Autowired
	private SmUserMapper userMapper;
	
	@Autowired
	private SmTodayPriceMapper todayPriceMapper;
	
	@Autowired
	private SmNoticeMapper noticeMapper;
	
	@Autowired
	private BaiDuPicRecognizeUtil baiDuPicRecognizeUtil;
	
	@Value("${PAY_INFO_PATH}")
	private String PAY_INFO_PATH;
	
	@Value("${VOUCHER_PATH}")
	private String VOUCHER_PATH;
	
	@Value("${DOWNLOAD_PREFIX}")
	private String DOWNLOAD_PREFIX;
	
	@Override
	public OrderListRespDto orderList(OrderListReqDto req) {
		
		OrderListRespDto resp = new OrderListRespDto();
		List<OrderListDto> respList = new ArrayList<OrderListDto>();
		Map<String, Object> params = new HashMap<String, Object>();
		if(StringUtils.isNotBlank(req.getOpenId())){
			params.put("openId", req.getOpenId().trim());
		}
		if(StringUtils.isNotBlank(req.getVoucherNo())){
			params.put("voucherNo", req.getVoucherNo().trim());
		}
		if(null != req.getStatus()){
			params.put("status", req.getStatus());
		}
		if(null != req.getStartTime()){
			Date startTime = new Date(req.getStartTime());
			params.put("startTime", startTime);
		}
		if(null != req.getEndTime()){
			Date endTime = new Date(req.getEndTime());
			params.put("endTime", endTime);
		}
		int total = orderMapper.countOrderList(params);
		
		if(null != req.getPageNum() && null != req.getPageSize()){
			int start = PageQueryReq.getStart(req);
			int size = req.getPageSize();
			params.put("start", start);
			params.put("size", size);
			resp.setPageNum(req.getPageNum());
			resp.setPageSize(req.getPageSize());
			resp.setTotalCount(total);
			resp.setPageTotalCount((int)(Math.ceil(total*1.0/size)));
		}
		
		List<SmOrder> list = new ArrayList<SmOrder>();
		list = orderMapper.orderList(params);
		
		List<Long> voucherIds = new ArrayList<Long>();
		if(null != list && list.size() > 0){
			for(SmOrder order : list){
				voucherIds.add(order.getVoucherId());
			}
		}
		//查询票据名称
		List<SmVoucher> voucherList = voucherMapper.selectVoucherListByIds(voucherIds);
		Map<Long, String> voucherId2TitleMap = new HashMap<Long, String>();
		if(null != voucherList && voucherList.size() > 0){
			for(SmVoucher voucher : voucherList){
				voucherId2TitleMap.put(voucher.getId(), voucher.getTitle());
			}
		}
				
		if(null != list && list.size() > 0){
			for(SmOrder order : list){
				OrderListDto dto = new OrderListDto();
				BeanUtils.copyProperties(order, dto);
				dto.setCreateTime(DateUtil.formatDate(order.getCreateTime(), DateUtil.SP1));
				dto.setTitle(voucherId2TitleMap.get(order.getVoucherId()));
				respList.add(dto);
				
			}
		}
		
		resp.setList(respList);
		return resp;
	}

	@Override
	public QueryPayInfoRespDto queryPayInfo(QueryPayInfoReqDto req) {
		QueryPayInfoRespDto resp = new QueryPayInfoRespDto();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("openId", req.getOpenId().trim());
		
		SmPayInfo payInfo = payInfoMapper.queryPayInfo(params);
		if(null != payInfo){
			resp.setAlipayNo(payInfo.getAlipayNo());
			resp.setAlipayUrl(payInfo.getAlipayUrl());
		}
		return resp;
	}
	

	@Override
	public Integer saveOrUpdatePayInfo(String openId, MultipartFile file, String alipayNo) {
		String alipayUrl = "";
		if(null != file){
			// 上传文件
			try {
				File dir = new File(PAY_INFO_PATH);
				if(!dir.exists()){
					dir.mkdirs();
				}
				String fileName = file.getOriginalFilename();
				fileName = alipayNo +"."+fileName.split("\\.")[1];
				File targetFile = new File(PAY_INFO_PATH + fileName);
				if(!targetFile.exists()){
        			targetFile.createNewFile();
        		}
        		InputStream in = file.getInputStream();
        		FileOutputStream fos = new FileOutputStream(targetFile, true);
        		byte[] buf = new byte[1024];
        		int len = 0 ;
        		while ((len = in.read(buf)) > 0) {
                    fos.write(buf, 0, len);
                    fos.flush();
                }
				fos.close();
				fos.close();
				alipayUrl = DOWNLOAD_PREFIX+"alipay/"+fileName;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		SmPayInfo payInfo = new SmPayInfo();
		payInfo.setAlipayNo(alipayNo);
		payInfo.setAlipayUrl(alipayUrl);
		payInfo.setOpenId(openId);
		return payInfoMapper.saveOrUpdatePayInfo(payInfo);
	}

	@Transactional
	@Override
	public boolean submitVoucher(String openId, Long voucherId, MultipartFile file, String voucherNo) {
		String dirPath = "";
		String fileName = "";
		if(null != file){
			// 上传文件
			try {
				dirPath = new StringBuffer(VOUCHER_PATH).append(openId).append("/").toString();
				File dir = new File(dirPath);
				if(!dir.exists()){
					dir.mkdirs();
				}
				String originalFilename = file.getOriginalFilename();
				StringBuffer fileNameBuffer = new StringBuffer();
				fileNameBuffer.append(voucherId);
				fileNameBuffer.append("_");
				fileNameBuffer.append(UUID.randomUUID().toString());
				fileNameBuffer.append(".");
				fileNameBuffer.append(originalFilename.split("\\.")[1]);
				fileName = fileNameBuffer.toString();
				File targetFile = new File(dirPath + fileName.toString());
        		if(!targetFile.exists()){
        			targetFile.createNewFile();
        		}
        		InputStream in = file.getInputStream();
        		FileOutputStream fos = new FileOutputStream(targetFile, true);
        		byte[] buf = new byte[1024];
        		int len = 0 ;
        		while ((len = in.read(buf)) > 0) {
                    fos.write(buf, 0, len);
                    fos.flush();
                }
				fos.close();
			} catch (Exception e) {
				logger.error("submit voucher error", e);
				return false;
			}
		}
		//图片识别
		try{
			//前端未传券码，开启图片识别功能
			if(StringUtils.isBlank(voucherNo)){
				//http://47.106.206.152/WeiXin/files/111.jpg
				String imgUrl = DOWNLOAD_PREFIX + fileName;
				GeneralBasicRespDto generalBasicRespDto = baiDuPicRecognizeUtil.recognizePic(imgUrl);
			    if(null != generalBasicRespDto){
			    	List<WordResultDto> wordList = generalBasicRespDto.getWordsResult();
			    	if(null != wordList && wordList.size() > 0){
			    		for(WordResultDto word : wordList){
			    			if(word.getWords().startsWith("券码:")){
			    				voucherNo = word.getWords().split(":")[1];
			    				break;
			    			}
			    		}
			    	}
			    }
			}
		
		}catch(Exception e){
			logger.error("call baidu recognize image api error", e);
			return false;
		}
		
	    //查询今日价格
		SmTodayPrice todayPrice = todayPriceMapper.selectByVoucherId(voucherId);
		
		//创建订单
		SmOrder order = new SmOrder();
		order.setOpenId(openId);
		order.setVoucherId(voucherId);
		order.setVoucherNo(voucherNo);
		//TODO 优化
		order.setVoucherUrl(dirPath+fileName);
		order.setPrice(todayPrice.getPrice());
		orderMapper.insertSelective(order);
		return true;
	}
	
	

	@Override
	public boolean backVoucher(BackVoucherReqDto req) {
		try{
			orderMapper.backVoucher(req.getOpenId(), req.getVoucherNo());
		}catch(Exception e){
			logger.error("back voucher error", e);
			return false;
		}
		return true;
	}

	@Override
	public VoucherListRespDto voucherList(VoucherListReqDto req) {
		VoucherListRespDto resp = new VoucherListRespDto();
		List<VoucherDto> respList = new ArrayList<VoucherDto>();
		Map<String, Object> params = new HashMap<String, Object>();
		
		int total = voucherMapper.countVoucherList(params);
		
		if(null != req.getPageNum() && null != req.getPageSize()){
			int start = PageQueryReq.getStart(req);
			int size = req.getPageSize();
			params.put("start", start);
			params.put("size", size);
			resp.setPageNum(req.getPageNum());
			resp.setPageSize(req.getPageSize());
			resp.setTotalCount(total);
			resp.setPageTotalCount((int)(Math.ceil(total*1.0/size)));
		}
		
		List<SmVoucherEx> list = new ArrayList<SmVoucherEx>();
		list = voucherMapper.voucherList(params);
		if(null != list && list.size() > 0){
			for(SmVoucherEx voucher : list){
				VoucherDto dto = new VoucherDto();
				BeanUtils.copyProperties(voucher, dto);
				respList.add(dto);
			}
		}
		resp.setList(respList);
		return resp;
	}

	@Override
	public boolean register(RegisterUserReqDto req) {
		
		SmUser user = new SmUser();
		try{
			BeanUtils.copyProperties(req, user);
			userMapper.insertSelective(user);
		}catch(Exception e){
			logger.error("register user error", e);
			return false;
		}
		return true;
	}

	@Override
	public QueryNoticeRespDto queryNotice() {
		QueryNoticeRespDto resp = new QueryNoticeRespDto();
		SmNotice notice = noticeMapper.selectNewerNotice();
		BeanUtils.copyProperties(notice, resp);
		resp.setCreateTime(DateUtil.formatDate(notice.getCreateTime(), DateUtil.SP1));
		return resp;
	}

	@Override
	public BaseResponse<AuthRespDto> auth(String code) {
		logger.info("进入验证");
        logger.info("code={}", code);
        BaseResponse<AuthRespDto> baseResp = new BaseResponse<AuthRespDto>();
        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wxef77eaf24420a6c6&secret=867377bf5bdf98b6edb97f6a66bb1d17&code=" + code + "&grant_type=authorization_code";
        RestTemplate restTemplate = new RestTemplate();
        AuthRespDto resp = null;
        try{
        	String jsonStr = restTemplate.getForObject(url,String.class);
            resp = JSONObject.parseObject(jsonStr, AuthRespDto.class);
        }catch(Exception e){
        	logger.error("wechat auth,get access token error", e);
        	baseResp.setCode(ResponseCode.FAIL.getCode());
        	baseResp.setMsg("system error");
        }
        if(null != resp && StringUtils.isNotBlank(resp.getErrmsg())){
        	baseResp.setCode(ResponseCode.FAIL.getCode());
        	baseResp.setMsg(resp.getErrmsg());
        }
        return ResponseUtil.buildResp(resp);
	}

	
}
