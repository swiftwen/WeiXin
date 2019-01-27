package com.aitravelba.dto.req.wechat;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

/**
 * 
 * @author swiftwen
 * @date 2019年1月24日 下午6:45:20
 */
@Data
public class QueryPayInfoReqDto implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotBlank(message="openId不能为空")
	private String openId;
	
}
