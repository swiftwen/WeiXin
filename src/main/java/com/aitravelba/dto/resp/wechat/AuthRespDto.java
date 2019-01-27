package com.aitravelba.dto.resp.wechat;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

/**
 * 
 * @author swiftwen
 * @date 2019年1月27日 下午5:51:35
 */
@Data
public class AuthRespDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JSONField(name="openid")
	private String openId;
	@JSONField(name="access_token")
	private String accessToken;
	
	@JSONField(name="refresh_token")
	private String refreshToken;
	
	private String scope;

	@JSONField(name="expires_in")
	private Long expiresIn;
	
	private String errcode;
	
	private String errmsg;
}
