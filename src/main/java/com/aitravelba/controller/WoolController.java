package com.aitravelba.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aitravelba.common.resp.BaseResponse;
import com.aitravelba.common.resp.ResponseCode;
import com.aitravelba.dto.req.wechat.OrderListReqDto;
import com.aitravelba.dto.resp.wechat.OrderListRespDto;
import com.aitravelba.util.ResponseUtil;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
/**
 * 
 * @author swiftwen
 * @date 2019年11月19日 上午11:06:18
 */
@Controller
@RequestMapping(value = "/alimama")
@Slf4j
public class WoolController extends BaseController {


	
	@ApiOperation(value = "1111" ,  notes="1111")
	@PostMapping(value = "/11111")
	public BaseResponse<OrderListRespDto> t11111(HttpServletRequest request, HttpServletResponse response,
			@Valid @RequestBody OrderListReqDto req, BindingResult result) {
		if (result.hasErrors()) {
			return new BaseResponse<OrderListRespDto>(ResponseCode.FAIL.getCode(),
					result.getAllErrors().get(0).getDefaultMessage());
		}
		log.info("orderList,req:{}",req);
	    
		return null;
	}
	
}
