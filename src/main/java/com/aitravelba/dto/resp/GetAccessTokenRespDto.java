package com.aitravelba.dto.resp;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
 * @author swiftwen
 * @date 2019年1月23日 下午1:17:35
 */
public class GetAccessTokenRespDto {

	@JSONField(name="access_token")
	private String accessToken;
	
	@JSONField(name="expires_in")
	private Long expiresIn;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public Long getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(Long expiresIn) {
		this.expiresIn = expiresIn;
	}

	@Override
	public String toString() {
		return "GetAccessTokenRespDto [accessToken=" + accessToken + ", expiresIn=" + expiresIn + "]";
	}
	
	
}
