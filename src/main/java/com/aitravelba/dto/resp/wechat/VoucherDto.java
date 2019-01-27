package com.aitravelba.dto.resp.wechat;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class VoucherDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 自增id
	 */
	private Long id;

	@ApiModelProperty(value = "分类id")
	private Long catId;

	@ApiModelProperty(value = "分类名称")
	private String catTitle;

	@ApiModelProperty(value = "票券名称")
	private String voucherTitle;

	@ApiModelProperty(value = "票券图片")
	private String picUrl;

	@ApiModelProperty(value = "回收价格")
	private Double price;

}
