package com.aitravelba.dto.req.wechat;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

/**
 * 票据撤销req
 * @author swiftwen
 * @date 2019年1月29日 下午1:34:35
 */
@Data
public class BackVoucherReqDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotBlank(message="openId不能为空")
	private String openId;
	
	@NotBlank(message="voucherNo不能为空")
	private String voucherNo;
	
	

	
}
