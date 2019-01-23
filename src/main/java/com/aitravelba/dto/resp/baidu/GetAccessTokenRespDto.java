package com.aitravelba.dto.resp.baidu;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * get baidu access token
 * @author swiftwen
 * @date 2019年1月22日 下午7:33:25
 */
public class GetAccessTokenRespDto {

	@JSONField(name="refresh_token")
	private String refreshToken;
	
	@JSONField(name="expires_in")
	private Long expiresIn; 
	
	@JSONField(name="session_key")
	private String sessionKey;
	
	@JSONField(name="access_token")
	private String accessToken;

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public Long getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(Long expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getSessionKey() {
		return sessionKey;
	}

	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	
	
}
