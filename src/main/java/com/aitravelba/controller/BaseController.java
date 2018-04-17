package com.aitravelba.controller;


import com.aitravelba.common.req.BaseRequest;

/**
 * @desc 
 * @Author wenpeng
 * @2017年10月12日 上午11:18:40
 */
public class BaseController {

    ThreadLocal<BaseRequest> baseRequestThreadLocal = new ThreadLocal<BaseRequest>();

    public BaseRequest getBaseRequest() {
        return baseRequestThreadLocal.get();
    }

    public void setBaseRequest(BaseRequest baseRequest) {
        baseRequestThreadLocal.set(baseRequest);
    }

    public void clearBaseRequest() {
        baseRequestThreadLocal.remove();
    }

}
