package com.aitravelba.controller;

import java.util.concurrent.ExecutionException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aitravelba.common.ConfigIdType;
import com.aitravelba.dto.req.TextMessageReqDto;
import com.aitravelba.dto.resp.TextMessageRespDto;
import com.aitravelba.pojo.wechat.Config;
import com.aitravelba.service.ConfigService;
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
	private ConfigService configService;
	
	//@Autowired
	//private RedisTemplate<String, String> redisTemplate;

	/*private LoadingCache<Long, AtomicLong> counter =  CacheBuilder.newBuilder().expireAfterWrite(2, TimeUnit.SECONDS).build(new CacheLoader<Long, AtomicLong>() {
        @Override
        public AtomicLong load(Long seconds) throws Exception {
            return new AtomicLong(0);
        }
    });*/
	
	//public static long permit = 2;
	//private LinkedHashMapCache<Long,AtomicLong> mapCache = new LinkedHashMapCache<Long,AtomicLong>(3);
	
	@RequestMapping(value = "/check",produces = "application/xml")
	@ResponseBody
    public TextMessageRespDto check(HttpServletRequest request, HttpServletResponse response,
    		@RequestParam(name = "signature", required = true) String signature,
    		@RequestParam(name = "timestamp", required = true) String timestamp,
    		@RequestParam(name = "nonce", required = true) String nonce,
    		@RequestParam(name = "echostr", required = false) String echostr,
    		@RequestBody(required = false) TextMessageReqDto req) {
		log.info("req:{}",req);
        if(StringUtils.isNotBlank(signature) && StringUtils.isNotBlank(timestamp) 
        		&& StringUtils.isNotBlank(nonce)) {
        	boolean checkApprove = WeiXinValidationUtil.checkSignature(signature,timestamp, nonce);
        	
        	if(checkApprove) {  //微信服务器接入校验
        		log.info("校验成功");
        		Config config = configService.selectByConfigId(ConfigIdType.INIT_CHECK);
        		if(null == config || "0".equals(config.getConfig())){
        			return weiXinService.acceptMsg(request, response,req);
        		}else{
        			weiXinService.serverInit(response,echostr);
        		}
        		
        	}else {
        		log.info("校验失败");
        	}
        }
        return null;
    }
	
	@RequestMapping(value = "/testRate")
	@ResponseBody
    public String checkTest(HttpServletRequest request, HttpServletResponse response) throws ExecutionException {
		//得到当前秒
        //long currentSeconds = System.currentTimeMillis() / 1000;
        
        /*if(counter.get(currentSeconds).incrementAndGet() > permit) {
            return "访问速率过快";
        }*/
        
        //AtomicLong v = mapCache.get(currentSeconds);
        
		return "ok";
    }
}
