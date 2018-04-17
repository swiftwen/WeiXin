package com.aitravelba.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aitravelba.dto.req.TextMessageReqDto;
import com.aitravelba.dto.resp.TextMessageRespDto;

/**
 * 
 * @desc 
 * @Author wenpeng
 * @2017年10月11日 下午4:02:06
 */
public interface WeiXinService {

	/**
	 * @desc 接入微信服务器
	 * @param response 
	 * @Author wenpeng
	 * @2017年10月12日 下午12:55:58
	 */
	void serverInit(HttpServletResponse response,String echostr);
	/**
	 * @desc 接受微信服务器消息
	 * @param request
	 * @param response 
	 * @Author wenpeng
	 * @2017年10月11日 下午4:03:32
	 */
	TextMessageRespDto acceptMsg(HttpServletRequest request, HttpServletResponse response,TextMessageReqDto req);
	/**
	 * @desc 响应微信服务器消息
	 * @param request
	 * @param response
	 * @param msg 
	 * @Author wenpeng
	 * @2017年10月11日 下午4:06:43
	 */
	TextMessageRespDto sendMsg(HttpServletRequest request, HttpServletResponse response,TextMessageReqDto msg);
}
