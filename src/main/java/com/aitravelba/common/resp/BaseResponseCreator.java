package com.aitravelba.common.resp;

/**
 * 
 * @desc 
 * @Author wenpeng
 * @2017年10月11日 下午3:04:19
 */
public class BaseResponseCreator {
    public BaseResponse create(Object data){
        return new BaseResponse(ResponseCode.SUCCESS, data);
    }
}
