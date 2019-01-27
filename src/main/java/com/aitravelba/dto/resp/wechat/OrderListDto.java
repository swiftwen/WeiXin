package com.aitravelba.dto.resp.wechat;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 订单列表响应
 * @author swiftwen
 * @date 2019年1月24日 下午2:46:14
 */
@Data
public class OrderListDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@ApiModelProperty(value = "票据名称")
	private String title;
	
	@ApiModelProperty(value = "票据号")
	private String voucherNo;
	@ApiModelProperty(value = "价格")
	private Double price;
	@ApiModelProperty(value = "订单状态（1：有效，-1：无效，0：核验中）")
	private Byte status;
	@ApiModelProperty(value = "备注")
	private String remark;
	@ApiModelProperty(value = "订单创建时间")
	private String createTime;


	
}
