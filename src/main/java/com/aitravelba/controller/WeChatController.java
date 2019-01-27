package com.aitravelba.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

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

import com.aitravelba.common.resp.BaseResponse;
import com.aitravelba.common.resp.ResponseCode;
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
import com.aitravelba.dto.resp.wechat.VoucherDetailRespDto;
import com.aitravelba.dto.resp.wechat.VoucherListRespDto;
import com.aitravelba.service.WeChatService;

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
		OrderListRespDto resp = weChatService.orderList(req);
		return new BaseResponse<OrderListRespDto>(resp);
	}
	
	@ApiOperation(value = "查询收款信息" ,  notes="查询收款信息")
	@PostMapping(value = "/queryPayInfo")
	public BaseResponse<QueryPayInfoRespDto> queryPayInfo(HttpServletRequest request, HttpServletResponse response,
			@Valid @RequestBody QueryPayInfoReqDto req, BindingResult result) {
		if (result.hasErrors()) {
			return new BaseResponse<QueryPayInfoRespDto>(ResponseCode.FAIL.getCode(),
					result.getAllErrors().get(0).getDefaultMessage());
		}
		QueryPayInfoRespDto resp = weChatService.queryPayInfo(req);
		return new BaseResponse<QueryPayInfoRespDto>(resp);
	}
	
	@ApiOperation(value = "新增或更新收款信息" ,  notes="新增或更新收款信息")
	@GetMapping(value = "/saveOrUpdatePayInfo")
	public BaseResponse<SaveOrUpdatePayInfoRespDto> saveOrUpdatePayInfo(HttpServletRequest request, HttpServletResponse response,
			@ApiParam(value = "收款二维码图片", type = "file", required = false) @RequestParam(required = false) MultipartFile file,
			String openId, String alipayNo) {
		
		Integer ret = weChatService.saveOrUpdatePayInfo(openId, file, alipayNo);
		SaveOrUpdatePayInfoRespDto resp = new SaveOrUpdatePayInfoRespDto();
		if(null == ret || ret == 0){
			resp.setRet(false);
		}else{
			resp.setRet(true);
		}
		return new BaseResponse<SaveOrUpdatePayInfoRespDto>(resp);
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
		return new BaseResponse<VoucherListRespDto>(resp);
	}
	
	@ApiOperation(value = "回收票据详情" ,  notes="回收票据详情")
	@GetMapping(value = "/voucherDetail")
	public BaseResponse<VoucherDetailRespDto> voucherDetail(HttpServletRequest request, HttpServletResponse response,
			@Valid @RequestBody VoucherListReqDto req, BindingResult result) {
		return null;
	}

	@ApiOperation(value = "票据提交" ,  notes="票据提交")
	@PostMapping(value = "/submitVoucher")
	public BaseResponse<CommonBooleanRespDto> submitVoucher(HttpServletRequest request, HttpServletResponse response,
			@ApiParam(value = "收款二维码图片", type = "file", required = false) @RequestParam(required = false) MultipartFile file,
			String openId, Long voucherId, String voucherNo) {
		logger.info("[submitVoucher],openId:{},voucherId:{},voucherNo:{}",openId, voucherId, voucherNo);
		boolean ret = weChatService.submitVoucher(openId, voucherId, file, voucherNo);
		CommonBooleanRespDto resp = new CommonBooleanRespDto();
		resp.setRet(ret);
		return new BaseResponse<CommonBooleanRespDto>(resp);
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
		return new BaseResponse<CommonBooleanRespDto>(resp);
	}
	
	@ApiOperation(value = "查询公告" ,  notes="查询公告")
	@GetMapping(value = "/queryNotice")
	public BaseResponse<QueryNoticeRespDto> queryNotice(HttpServletRequest request, HttpServletResponse response) {
		logger.debug("query notice");
		QueryNoticeRespDto resp = weChatService.queryNotice();
		return new BaseResponse<QueryNoticeRespDto>(resp);
	}
	@ApiOperation(value = "微信网页授权获取token" ,  notes="微信网页授权token")
	@GetMapping("auth")
    public BaseResponse<AuthRespDto> auth(@RequestParam("code") String code) {
        logger.info("进入验证");
        logger.info("code={}", code);
        return weChatService.auth(code);
    }

}
