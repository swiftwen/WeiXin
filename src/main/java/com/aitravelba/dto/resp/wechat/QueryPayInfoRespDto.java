package com.aitravelba.dto.resp.wechat;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 
 * @author swiftwen
 * @date 2019年1月24日 下午6:47:51
 */
@Data
public class QueryPayInfoRespDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value = "支付宝账号")
	private String alipayNo;
	@ApiModelProperty(value = "支付宝收款二维码")
	private String alipayUrl;

	
}
