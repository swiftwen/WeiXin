package com.aitravelba.util;

import com.aitravelba.common.resp.BaseResponse;
/**
 * 
 * @author swiftwen
 * @date 2019年1月28日 下午2:29:21
 */
public class ResponseUtil {

	public static <T> BaseResponse<T> buildResp(T t) {
		BaseResponse<T> resultDto = new BaseResponse<T>();
		resultDto.setData(t);
		return resultDto;
	}
	// public static <T> ResultDTO<T> buildErrorResp(String message) {
	// ResultDTO<T> resultDto = new ResultDTO<T>();
	// // resultDto.setData(t);
	// resultDto.setMessage(message);
	// return resultDto;
	// }
}
