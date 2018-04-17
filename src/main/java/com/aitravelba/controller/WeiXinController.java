package com.aitravelba.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aitravelba.dto.req.TextMessageReqDto;
import com.aitravelba.dto.resp.TextMessageRespDto;
import com.aitravelba.service.WeiXinService;
import com.aitravelba.util.WeiXinValidationUtil;
/**
 * 
 * @desc 微信服务controller
 * @Author wenpeng
 * @2017年10月11日 下午5:35:05
 */
@Controller
@RequestMapping(value = "/weixinServer")
public class WeiXinController extends BaseController {

	private static final Logger log= LoggerFactory.getLogger(WeiXinController.class);
	@Autowired
	private WeiXinService weiXinService;
	@Autowired
	private RedisTemplate<String, String> redisTemplate;
	
	@RequestMapping(value = "/check",produces = "application/xml")
	@ResponseBody
    public TextMessageRespDto check(HttpServletRequest request, HttpServletResponse response,
    		@RequestParam(name = "signature", required = true) String signature,
    		@RequestParam(name = "timestamp", required = true) String timestamp,
    		@RequestParam(name = "nonce", required = true) String nonce,
    		@RequestParam(name = "echostr", required = false) String echostr,
    		@RequestBody(required=false) TextMessageReqDto req) {
		log.info("req:{}",req);
        if(StringUtils.isNotBlank(signature) && StringUtils.isNotBlank(timestamp) 
        		&& StringUtils.isNotBlank(nonce)) {
        	boolean checkApprove = WeiXinValidationUtil.checkSignature(signature,timestamp, nonce);
        	
        	if(checkApprove) {  //微信服务器接入校验
        		log.info("校验成功");
        		//weiXinService.serverInit(response,echostr);
        		return weiXinService.acceptMsg(request, response,req);
        	}else {
        		log.info("校验失败");
        	}
        }
        return null;
    }
	@RequestMapping(value = "/checkTest",produces = "application/xml")
	@ResponseBody
    public TextMessageRespDto checkTest(HttpServletRequest request, HttpServletResponse response,
    		@RequestParam(name = "signature", required = false) String signature,
    		@RequestParam(name = "timestamp", required = false) String timestamp,
    		@RequestParam(name = "nonce", required = false) String nonce,
    		@RequestParam(name = "echostr", required = false) String echostr,
    		@RequestBody(required=false) TextMessageReqDto req) {
		log.info("req:{}",req);
        
		//redisTemplate.opsForValue().set("name", "wenpeng");
		String name = redisTemplate.opsForValue().get("wenpeng");
		System.out.println("name="+name);
		
        return null;
    }
}
