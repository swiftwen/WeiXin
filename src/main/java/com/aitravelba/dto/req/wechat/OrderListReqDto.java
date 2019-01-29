package com.aitravelba.dto.req.wechat;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

import com.aitravelba.common.req.PageQueryReq;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 
 * @author swiftwen
 * @date 2019年1月24日 下午2:49:52
 */
@Data
public class OrderListReqDto extends PageQueryReq implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotBlank(message="openid不能为空")
	@ApiModelProperty(value = "微信openid")
	private String openId;
	
	@ApiModelProperty(value = "订单状态（1：有效，-1：无效，0：核验中,-2:未验）")
	private Byte status;
	
	@ApiModelProperty(value = "券码号")
	private String voucherNo;
	
	@ApiModelProperty(value = "订单开始时间（时间戳）")
	private Long startTime;
	
	@ApiModelProperty(value = "订单结束时间（时间戳）")
	private Long endTime;

}
