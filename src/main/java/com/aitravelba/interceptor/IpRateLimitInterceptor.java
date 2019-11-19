package com.aitravelba.interceptor;


import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.validation.BindingResult;

import com.aitravelba.controller.BaseController;
import com.aitravelba.util.RateLimit;


/**
 * ip频率限制拦截器
 * @author swiftwen
 * @date 2019年4月3日 下午2:22:14
 */
@Aspect
@Configuration
@Order(1)
public class IpRateLimitInterceptor {

    @Autowired
    private RateLimit rateLimit;
    
    @Autowired
  	private RedisTemplate<String, Object> redisTemplate;

    private static final Logger logger = LoggerFactory.getLogger(IpRateLimitInterceptor.class);
    /*
     * 定义一个切入点
     */
    @Pointcut("execution(* com.aitravelba.controller.*.*(..)) && args(..)")
    public void executeIpRateLimit() {
    	
    }
    @Before("executeIpRateLimit()")
    public void process(JoinPoint  joinPoint)throws Throwable {
    	BaseController baseController = (BaseController) joinPoint.getTarget();
        Object[] args = joinPoint.getArgs();
        HttpServletRequest request = null;
        Object obj = null;
        for (Object arg : args) {
            if (arg instanceof HttpServletRequest) {
            	request = (HttpServletRequest) arg;
            }else if(arg instanceof BindingResult || arg instanceof HttpServletResponse) {
            	continue;
            }else {
            	obj = arg;
            }
        }
        if(null != request){
        	 String ip = request.getRemoteAddr();
             long currentSeconds = System.currentTimeMillis() / 1000;
             if(!rateLimit.tryAcquire()){
             	logger.info("接口访问频率过快");
             }
             
             String redisKey = ip;
             logger.info("redisKey:{}",redisKey);
             Integer redisValue  = (null == redisTemplate.opsForValue().get(redisKey)) ? 0 : ((Integer)redisTemplate.opsForValue().get(redisKey));
             if(0 == redisValue){
             	redisTemplate.opsForValue().set(redisKey, 1, 5, TimeUnit.SECONDS);
             }else if(redisValue >= 10){
             	logger.info("access fail,ip access limit");
             	throw new Exception("access fail,ip access limit");
             }else{
             	redisTemplate.opsForValue().increment(redisKey, 1);
             }
        }
       
    }
    
   /* private boolean needValidateSession(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        SessionValidIgnore sessionValidIgnore = method.getAnnotation(SessionValidIgnore.class);
        if (sessionValidIgnore != null && sessionValidIgnore.value() == true) {
            return false;
        }
        return true;
    }*/
}
