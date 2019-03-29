package com.aitravelba.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.aitravelba.common.resp.BaseResponse;
import com.aitravelba.common.resp.ResponseCode;
import com.aitravelba.dto.req.wechat.BackVoucherReqDto;
import com.aitravelba.dto.req.wechat.OrderListReqDto;
import com.aitravelba.dto.req.wechat.QueryPayInfoReqDto;
import com.aitravelba.dto.req.wechat.RegisterUserReqDto;
import com.aitravelba.dto.req.wechat.VoucherListReqDto;
import com.aitravelba.dto.resp.wechat.AuthRespDto;
import com.aitravelba.dto.resp.wechat.CommonBooleanRespDto;
import com.aitravelba.dto.resp.wechat.OrderListRespDto;
import com.aitravelba.dto.resp.wechat.QueryNoticeRespDto;
import com.aitravelba.dto.resp.wechat.QueryPayInfoRespDto;
import com.aitravelba.dto.resp.wechat.SaveOrUpdatePayInfoRespDto;
import com.aitravelba.dto.resp.wechat.UserInfoRespDto;
import com.aitravelba.dto.resp.wechat.VoucherDetailRespDto;
import com.aitravelba.dto.resp.wechat.VoucherListRespDto;
import com.aitravelba.service.WeChatService;
import com.aitravelba.util.ResponseUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 
 * @author swiftwen
 * @date 2019年1月24日 下午2:43:05
 */
@Api(tags= {"微信接口"})
@RestController
@RequestMapping(value = "/wechat")
public class WeChatController extends BaseController {

	private static final Logger logger = LoggerFactory.getLogger(WeChatController.class);
	
	@Autowired
	private WeChatService weChatService;

	@ApiOperation(value = "订单列表" ,  notes="订单列表")
	@PostMapping(value = "/orderList")
	public BaseResponse<OrderListRespDto> orderList(HttpServletRequest request, HttpServletResponse response,
			@Valid @RequestBody OrderListReqDto req, BindingResult result) {
		if (result.hasErrors()) {
			return new BaseResponse<OrderListRespDto>(ResponseCode.FAIL.getCode(),
					result.getAllErrors().get(0).getDefaultMessage());
		}
		logger.info("orderList,req:{}",req);
		OrderListRespDto resp = weChatService.orderList(req);
		return ResponseUtil.buildResp(resp);
	}
	
	@ApiOperation(value = "查询收款信息" ,  notes="查询收款信息")
	@PostMapping(value = "/queryPayInfo")
	public BaseResponse<QueryPayInfoRespDto> queryPayInfo(HttpServletRequest request, HttpServletResponse response,
			@Valid @RequestBody QueryPayInfoReqDto req, BindingResult result) {
		if (result.hasErrors()) {
			return new BaseResponse<QueryPayInfoRespDto>(ResponseCode.FAIL.getCode(),
					result.getAllErrors().get(0).getDefaultMessage());
		}
		logger.info("queryPayInfo,openId:{}",req.getOpenId());
		QueryPayInfoRespDto resp = weChatService.queryPayInfo(req);
		return ResponseUtil.buildResp(resp);
	}
	
	@ApiOperation(value = "新增或更新收款信息" ,  notes="新增或更新收款信息")
	@PostMapping(value = "/saveOrUpdatePayInfo")
	public BaseResponse<SaveOrUpdatePayInfoRespDto> saveOrUpdatePayInfo(HttpServletRequest request, HttpServletResponse response,
			@ApiParam(value = "收款二维码图片", type = "file", required = false) @RequestParam(required=false) String payFile,
			@RequestParam String openId, @RequestParam String alipayNo, @RequestParam String alipayName) {
		if(null == payFile){
			logger.info("file is null...");
		}else{
			logger.info("file not null");
		}
		logger.info("before decode,alipayName:{}",alipayName);
		try {
			alipayName = URLDecoder.decode(alipayName, "utf-8");
			//alipayName = new String(alipayName.getBytes("iso8859-1"),"utf-8");
		} catch (UnsupportedEncodingException e) {
			logger.error("url decoder error", e);
		}
		logger.info("after decode,alipayName:{}",alipayName);
		BaseResponse<SaveOrUpdatePayInfoRespDto> baseResp = new BaseResponse<SaveOrUpdatePayInfoRespDto>();
		if(StringUtils.isBlank(alipayNo)){
			baseResp.setCode(ResponseCode.FAIL.getCode());
			baseResp.setMsg("alipayNo不能为空");
			return baseResp;
		}
		if(StringUtils.isBlank(openId)){
			baseResp.setCode(ResponseCode.FAIL.getCode());
			baseResp.setMsg("openId不能为空");
			return baseResp;
		}
		logger.info("savePayInfo,alipayNo:{},openId:{},alipayName:{}",alipayNo,openId,alipayName);
		String remark = "";
		Integer ret = weChatService.saveOrUpdatePayInfo(openId, payFile, alipayNo, alipayName, remark);
		SaveOrUpdatePayInfoRespDto resp = new SaveOrUpdatePayInfoRespDto();
		if(null == ret || ret == 0){
			resp.setRet(false);
		}else{
			resp.setRet(true);
		}
		return ResponseUtil.buildResp(resp);
	}
	
	@ApiOperation(value = "查询回收票据列表" ,  notes="查询回收票据列表")
	@PostMapping(value = "/voucherList")
	public BaseResponse<VoucherListRespDto> voucherList(HttpServletRequest request, HttpServletResponse response,
			@Valid @RequestBody VoucherListReqDto req, BindingResult result) {
		if (result.hasErrors()) {
			return new BaseResponse<VoucherListRespDto>(ResponseCode.FAIL.getCode(),
					result.getAllErrors().get(0).getDefaultMessage());
		}
		VoucherListRespDto resp = weChatService.voucherList(req);
		return ResponseUtil.buildResp(resp);
	}
	
	@ApiOperation(value = "回收票据详情" ,  notes="回收票据详情")
	@GetMapping(value = "/voucherDetail")
	public BaseResponse<VoucherDetailRespDto> voucherDetail(HttpServletRequest request, HttpServletResponse response,
			Long voucherId) {
		logger.info("backVoucher,voucherId:{}",voucherId);
		if (null == voucherId || voucherId <= 0) {
			return new BaseResponse<VoucherDetailRespDto>(ResponseCode.FAIL.getCode(),
					"voucherId不能为空");
		}
		VoucherDetailRespDto respDto = new VoucherDetailRespDto();
		respDto.setPrice(27.5);
		respDto.setTitle("星巴克大杯-中信");
		List<String> source = new ArrayList<String>();
		String s1 = "1、操作路径：动卡空间app-首页-天天有券";
		String s2 = "2、请保证券码的有效性，且保证有10天以上的有效期";
		String s3 = "3、请上传带有券码的图片，若上传的券码已被使用或错误，即便您拿到货款，后续也会被追责，请卖家认真核实";
		source.add(s1);
		source.add(s2);
		source.add(s3);
		respDto.setSource(source);
		return new BaseResponse<VoucherDetailRespDto>(respDto);
	}

	@ApiOperation(value = "票据提交" ,  notes="票据提交")
	@PostMapping(value = "/submitVoucher")
	public BaseResponse<CommonBooleanRespDto> submitVoucher(HttpServletRequest request, HttpServletResponse response,
			@ApiParam(value = "券码图片", type = "file", required = false) @RequestParam String voucherFile,
			@RequestParam String openId, @RequestParam Long voucherId, @RequestParam String voucherNo) {
		logger.info("submitVoucher,openId:{},voucherId:{},voucherNo:{}",openId, voucherId, voucherNo);
		BaseResponse<CommonBooleanRespDto> resp = new BaseResponse<CommonBooleanRespDto>();
		CommonBooleanRespDto respDto = new CommonBooleanRespDto();
		if(StringUtils.isBlank(voucherNo)){
			resp.setCode(ResponseCode.FAIL.getCode());
			resp.setMsg("券码不能为空");
			return resp;
		}
		boolean ret = weChatService.submitVoucher(openId, voucherId, voucherFile, voucherNo);
		
		respDto.setRet(ret);
		return ResponseUtil.buildResp(respDto);
	}
	
	@ApiOperation(value = "票据撤销" ,  notes="票据撤销")
	@PostMapping(value = "/backVoucher")
	public BaseResponse<CommonBooleanRespDto> backVoucher(HttpServletRequest request, HttpServletResponse response,
			@Valid @RequestBody BackVoucherReqDto req, BindingResult result) {
		logger.info("backVoucher,openId:{},voucherNo:{}",req.getOpenId(), req.getVoucherNo());
		if (result.hasErrors()) {
			return new BaseResponse<CommonBooleanRespDto>(ResponseCode.FAIL.getCode(),
					result.getAllErrors().get(0).getDefaultMessage());
		}
		BaseResponse<CommonBooleanRespDto> resp = new BaseResponse<CommonBooleanRespDto>();
		boolean ret = weChatService.backVoucher(req);
		CommonBooleanRespDto respDto = new CommonBooleanRespDto();
		respDto.setRet(ret);
		if(!ret){
			resp.setCode(ResponseCode.FAIL.getCode());
			resp.setMsg("撤销失败");
		}else{
			resp.setMsg("撤销成功");
		}
		return resp;
	}
	
	@ApiOperation(value = "注册用户" ,  notes="注册用户")
	@PostMapping(value = "/register")
	public BaseResponse<CommonBooleanRespDto> register(HttpServletRequest request, HttpServletResponse response,
			@Valid @RequestBody RegisterUserReqDto req, BindingResult result) {
		if (result.hasErrors()) {
			return new BaseResponse<CommonBooleanRespDto>(ResponseCode.FAIL.getCode(),
					result.getAllErrors().get(0).getDefaultMessage());
		}
		CommonBooleanRespDto resp = new CommonBooleanRespDto();
		boolean ret = weChatService.register(req);
		resp.setRet(ret);
		return ResponseUtil.buildResp(resp);
	}
	
	@ApiOperation(value = "查询公告" ,  notes="查询公告")
	@GetMapping(value = "/queryNotice")
	public BaseResponse<QueryNoticeRespDto> queryNotice(HttpServletRequest request, HttpServletResponse response) {
		logger.debug("query notice");
		QueryNoticeRespDto resp = weChatService.queryNotice();
		return ResponseUtil.buildResp(resp);
	}
	@ApiOperation(value = "微信网页授权获取token" ,  notes="微信网页授权token")
	@GetMapping("auth")
    public BaseResponse<AuthRespDto> auth(@RequestParam("code") String code) {
        logger.info("auth进入验证,code:{}", code);
        return weChatService.auth(code);
    }
	
	
	@ApiOperation(value = "微信查询用户信息" ,  notes="微信查询用户信息")
	@GetMapping("getWxUserInfo")
    public BaseResponse<UserInfoRespDto> getWxUserInfo(@RequestParam("accessToken") String accessToken,
    		@RequestParam("openId") String openId) {
        logger.info("getWxUserInfo,accessToken:{},openId:{}", accessToken, openId);
        return weChatService.getWxUserInfo(accessToken, openId);
    }


}
