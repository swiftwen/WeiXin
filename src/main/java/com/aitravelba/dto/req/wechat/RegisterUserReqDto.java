package com.aitravelba.dto.req.wechat;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 
 * @author swiftwen
 * @date 2019年1月25日 上午11:57:28
 */
@Data
public class RegisterUserReqDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotBlank(message="openid不能为空")
	@ApiModelProperty(value = "微信openid")
	private String openId;
	
	@NotBlank(message="nickName不能为空")
	@ApiModelProperty(value = "nickName")
	private String nickName;
	
	private Byte sex;
	
	private String province;
	
	private String city;
	
	private String country;
	
	private String headImgUrl;

	
}
