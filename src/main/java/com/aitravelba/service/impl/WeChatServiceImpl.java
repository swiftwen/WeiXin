package com.aitravelba.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Base64Utils;
import org.springframework.web.client.RestTemplate;

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
import com.aitravelba.dto.resp.wechat.CommonBooleanRespDto;
import com.aitravelba.dto.resp.wechat.OrderListDto;
import com.aitravelba.dto.resp.wechat.OrderListRespDto;
import com.aitravelba.dto.resp.wechat.QueryNoticeRespDto;
import com.aitravelba.dto.resp.wechat.QueryPayInfoRespDto;
import com.aitravelba.dto.resp.wechat.UserInfoRespDto;
import com.aitravelba.dto.resp.wechat.VoucherDetailRespDto;
import com.aitravelba.dto.resp.wechat.VoucherDto;
import com.aitravelba.dto.resp.wechat.VoucherListRespDto;
import com.aitravelba.orm.wechat.RegexConfigMapper;
import com.aitravelba.orm.wechat.SmNoticeMapper;
import com.aitravelba.orm.wechat.SmOrderMapper;
import com.aitravelba.orm.wechat.SmPayInfoMapper;
import com.aitravelba.orm.wechat.SmTodayPriceMapper;
import com.aitravelba.orm.wechat.SmUserMapper;
import com.aitravelba.orm.wechat.SmVoucherMapper;
import com.aitravelba.orm.wechat.VoucherDetailMapper;
import com.aitravelba.pojo.wechat.RegexConfig;
import com.aitravelba.pojo.wechat.SmNotice;
import com.aitravelba.pojo.wechat.SmOrder;
import com.aitravelba.pojo.wechat.SmPayInfo;
import com.aitravelba.pojo.wechat.SmTodayPrice;
import com.aitravelba.pojo.wechat.SmUser;
import com.aitravelba.pojo.wechat.SmVoucher;
import com.aitravelba.pojo.wechat.SmVoucherEx;
import com.aitravelba.pojo.wechat.VoucherDetailEx;
import com.aitravelba.service.WeChatService;
import com.aitravelba.util.BaiDuPicRecognizeUtil;
import com.aitravelba.util.DateUtil;
import com.aitravelba.util.HttpUtil;
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
	private RegexConfigMapper regexConfigMapper;
	
	@Autowired
	private VoucherDetailMapper voucherDetailMapper;
	
	@Autowired
	private BaiDuPicRecognizeUtil baiDuPicRecognizeUtil;
	
	@Autowired
	private HttpUtil httpUtil;
	
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
			resp.setAlipayName(payInfo.getAlipayName());
			resp.setTestName(payInfo.getRemark());
		}
		return resp;
	}
	

	@Override
	public Integer saveOrUpdatePayInfo(String openId, String payFile, String alipayNo, String alipayName, String remark) {
		String dataPrix = "";
        String data = "";
        String suffix = "";
		if(null != payFile && !payFile.contains("47.106.206.152")){
			
	        if(payFile == null || "".equals(payFile)){
	            //throw new Exception("上传失败，上传图片数据为空");
	        	logger.error("上传失败，上传图片数据为空");
	        }else{
	            String [] d = payFile.split("base64,");
	            if(d != null && d.length == 2){
	                dataPrix = d[0];
	                data = d[1];
	            }else{
	               // throw new Exception("上传失败，数据不合法");
	            	logger.error("上传失败，数据不合法");
	            }
	        }
	        
	        logger.info("对数据进行解析，获取文件名和流数据,dataPrix:{}",dataPrix);
	        
	        if("data:image/jpeg;".equalsIgnoreCase(dataPrix)){//data:image/jpeg;base64,base64编码的jpeg图片数据
	            suffix = ".jpg";
	        } else if("data:image/x-icon;".equalsIgnoreCase(dataPrix)){//data:image/x-icon;base64,base64编码的icon图片数据
	            suffix = ".ico";
	        } else if("data:image/gif;".equalsIgnoreCase(dataPrix)){//data:image/gif;base64,base64编码的gif图片数据
	            suffix = ".gif";
	        } else if("data:image/png;".equalsIgnoreCase(dataPrix)){//data:image/png;base64,base64编码的png图片数据
	            suffix = ".png";
	        }else{
	            //throw new Exception("上传图片格式不合法");
	            logger.error("上传图片格式不合法");
	        }
		}
		
		String alipayUrl = "";
		if(null != payFile && !payFile.contains("47.106.206.152")){
			// 上传文件
			try {
				File dir = new File(PAY_INFO_PATH);
				if(!dir.exists()){
					dir.mkdirs();
				}
				//String fileName = file.getOriginalFilename();
				String fileName = alipayNo + suffix;
				File targetFile = new File(PAY_INFO_PATH + fileName);
				if(!targetFile.exists()){
        			targetFile.createNewFile();
        		}
				
				byte[] bs = Base64Utils.decodeFromString(data);
				
        		FileOutputStream fos = new FileOutputStream(targetFile);
                fos.write(bs, 0, bs.length);
                fos.flush();
				fos.close();
				fos.close();
				alipayUrl = DOWNLOAD_PREFIX+"alipay/"+fileName;
			} catch (Exception e) {
				logger.error("saveOrUpdatePayInfo upload file error", e);
				e.printStackTrace();
			}
		}else{
			alipayUrl = payFile;
		}
		SmPayInfo payInfo = new SmPayInfo();
		payInfo.setAlipayNo(alipayNo);
		payInfo.setAlipayUrl(alipayUrl);
		payInfo.setOpenId(openId);
		payInfo.setAlipayName(alipayName);
		payInfo.setRemark(remark);
		return payInfoMapper.saveOrUpdatePayInfo(payInfo);
	}

	@Transactional
	@Override
	public BaseResponse<CommonBooleanRespDto> submitVoucher(String openId, Long voucherId, String voucherFile, String voucherNo) {
		logger.info("submit voucher start...");
		String dirPath = "";
		String fileName = "";
		//boolean ret = false;
		CommonBooleanRespDto respDto = new CommonBooleanRespDto();
		byte[] bs = null;
		//BaseResponse<CommonBooleanRespDto> resp = new BaseResponse<CommonBooleanRespDto>();
		if(null != voucherFile){
			String dataPrix = "";
	        String data = "";
	        if(voucherFile == null || "".equals(voucherFile)){
	            //throw new Exception("上传失败，上传图片数据为空");
	        	logger.error("上传失败，上传图片数据为空");
	        }else{
	            String [] d = voucherFile.split("base64,");
	            if(d != null && d.length == 2){
	                dataPrix = d[0];
	                data = d[1];
	            }else{
	               // throw new Exception("上传失败，数据不合法");
	            	logger.error("上传失败，数据不合法");
	            }
	        }
	        
	        logger.info("对数据进行解析，获取文件名和流数据,dataPrix:{}",dataPrix);
	        String suffix = "";
	        if("data:image/jpeg;".equalsIgnoreCase(dataPrix)){//data:image/jpeg;base64,base64编码的jpeg图片数据
	            suffix = ".jpg";
	        } else if("data:image/x-icon;".equalsIgnoreCase(dataPrix)){//data:image/x-icon;base64,base64编码的icon图片数据
	            suffix = ".ico";
	        } else if("data:image/gif;".equalsIgnoreCase(dataPrix)){//data:image/gif;base64,base64编码的gif图片数据
	            suffix = ".gif";
	        } else if("data:image/png;".equalsIgnoreCase(dataPrix)){//data:image/png;base64,base64编码的png图片数据
	            suffix = ".png";
	        }else{
	            //throw new Exception("上传图片格式不合法");
	            logger.error("上传图片格式不合法");
	        }
	        
			// 上传文件
			try {
				dirPath = new StringBuffer(VOUCHER_PATH).append(openId).append("/").toString();
				File dir = new File(dirPath);
				if(!dir.exists()){
					dir.mkdirs();
				}
				StringBuffer fileNameBuffer = new StringBuffer();
				fileNameBuffer.append(voucherId);
				fileNameBuffer.append("_");
				fileNameBuffer.append(UUID.randomUUID().toString());
				fileNameBuffer.append(suffix);
				fileName = fileNameBuffer.toString();
				File targetFile = new File(dirPath + fileName.toString());
        		if(!targetFile.exists()){
        			targetFile.createNewFile();
        		}
        		bs = Base64Utils.decodeFromString(data);
        		
        		FileOutputStream fos = new FileOutputStream(targetFile);
                fos.write(bs, 0, bs.length);
                fos.flush();
				fos.close();
			} catch (Exception e) {
				logger.error("submit voucher error", e);
				respDto.setRet(false);
				return ResponseUtil.buildResp(respDto);
			}
		}
		//图片识别
		try{
			//前端未传券码，开启图片识别功能
			if(StringUtils.isBlank(voucherNo)){
				//http://47.106.206.152/WeiXin/files/111.jpg
				//String imgUrl = DOWNLOAD_PREFIX + "voucher/" +openId +"/" +fileName;
				GeneralBasicRespDto generalBasicRespDto = baiDuPicRecognizeUtil.recognizePicByBinaryData(bs);
			    if(null != generalBasicRespDto){
			    	List<WordResultDto> wordList = generalBasicRespDto.getWordsResult();
			    	if(null != wordList && wordList.size() > 0){
			    		RegexConfig regexConfig = regexConfigMapper.selectByVoucherId(voucherId);
			    		if(null == regexConfig){
			    			//无正则，不支持图片识别提取券码
			    			respDto.setRet(false);
			    			return ResponseUtil.buildDefinitionResp(respDto, "此类型券码图片暂不支持自动识别，请手动输入券码", ResponseCode.FAIL.getCode());
			    		}
			    		Pattern p = Pattern.compile(regexConfig.getRegex().trim());
			    		for(WordResultDto word : wordList){
			    			logger.info("word:{}",word.getWords());
			    			Matcher m = p.matcher(word.getWords());
			    			if(m.find()){
			    				logger.info("券码识别成功,voucherNo:{}", word.getWords());
			    				voucherNo = word.getWords();
			    				break;
			    			}
			    		}
			    	}
			    }
			}
		
		}catch(Exception e){
			logger.error("call baidu recognize image api error", e);
			respDto.setRet(false);
			return ResponseUtil.buildResp(respDto);
		}
	    //查询今日价格
		SmTodayPrice todayPrice = todayPriceMapper.selectByVoucherId(voucherId);
		//创建订单
		logger.info("create order start,openId:{}", openId);
		SmOrder order = new SmOrder();
		order.setOpenId(openId);
		order.setVoucherId(voucherId);
		if(StringUtils.isNotBlank(voucherNo)){
			order.setVoucherNo(voucherNo);
		}else{
			respDto.setRet(false);
			return ResponseUtil.buildDefinitionResp(respDto, "图片券码识别失败，请手动输入券码", ResponseCode.FAIL.getCode());
		}
		//券码路径
		order.setVoucherUrl(DOWNLOAD_PREFIX+"voucher/"+openId+"/"+fileName);
		order.setPrice(todayPrice.getPrice());
		try{
			orderMapper.insertSelective(order);
		}catch(Exception e){
			logger.error("券码提交异常", e);
			respDto.setRet(false);
			return ResponseUtil.buildDefinitionResp(respDto, "此券码已经提交，请勿重复提交", ResponseCode.FAIL.getCode());
		}
		
		logger.info("create order end,openId:{}", openId);
		respDto.setRet(true);
		return ResponseUtil.buildResp(respDto);
	}

	@Override
	public boolean backVoucher(BackVoucherReqDto req) {
		try{
			orderMapper.backVoucher(req.getOpenId(), req.getId());
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
        logger.info("进入验证code={}", code);
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

	@Override
	public BaseResponse<UserInfoRespDto> getWxUserInfo(String accessToken, String openId) {
		BaseResponse<UserInfoRespDto> baseResp = new BaseResponse<UserInfoRespDto>();
		String url = "https://api.weixin.qq.com/sns/userinfo?access_token="+accessToken+"&openid="+openId+"&lang=zh_CN";
		Map<String, String> headers = new HashMap<String, String>();
		String retJson = httpUtil.httpGet(url, headers);
		logger.info("get wechat user info ,retJson:{}", retJson);
		UserInfoRespDto wxUserInfo = JSONObject.parseObject(retJson, UserInfoRespDto.class);
		if(StringUtils.isNotBlank(wxUserInfo.getErrmsg())){
			baseResp.setCode(ResponseCode.FAIL.getCode());
        	baseResp.setMsg(wxUserInfo.getErrmsg());
		}else{
			baseResp.setData(wxUserInfo);
		}
		//注册用户
		RegisterUserReqDto registerUserReqDto = new RegisterUserReqDto();
		BeanUtils.copyProperties(wxUserInfo, registerUserReqDto);
		registerUserReqDto.setHeadImgUrl(wxUserInfo.getHeadimgurl());
		registerUserReqDto.setOpenId(wxUserInfo.getOpenid());
		registerUserReqDto.setNickName(wxUserInfo.getNickname());
		try{
			register(registerUserReqDto);
		}catch(Exception e){
			logger.error("register user error", e);
		}
		return baseResp;
	}

	@Override
	public VoucherDetailRespDto voucherDetail(Long voucherId) {
		VoucherDetailRespDto resp = new VoucherDetailRespDto();
		VoucherDetailEx voucherDetail = voucherDetailMapper.selectByVoucherId(voucherId);
		
		resp.setTitle(voucherDetail.getTitle());
		resp.setPrice(voucherDetail.getPrice());
		List<String> source = new ArrayList<String>();
		if(StringUtils.isNotBlank(voucherDetail.getSource())){
			String[] srcs = voucherDetail.getSource().split("###");
			for(int i=0;i<srcs.length;i++){
				source.add((i+1)+"、"+srcs[i]);
			}
		}else{
			source.add("暂无来源描述信息");
		}
		resp.setSource(source);
		
		return resp;
	}
	
}
