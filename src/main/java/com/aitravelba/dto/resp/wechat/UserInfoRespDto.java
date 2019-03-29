package com.aitravelba.dto.resp.wechat;

import lombok.Data;

/**
 * 
 * @author swiftwen
 * @date 2019年1月29日 上午10:53:48
 */
@Data
public class UserInfoRespDto {

	private Long id;
	
	private String nickname;
	
	private String openid;
	
	private Byte sex;
	
	private String province;
	
	private String city;
	
	private String country;
	
	private String headimgurl;
	
	private String errcode;
	
	private String errmsg;
}
