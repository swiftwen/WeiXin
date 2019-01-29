package com.aitravelba.dto.req.wechat;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 
 * @author swiftwen
 * @date 2019年1月29日 下午4:43:29
 */
@Data
public class VoucherDetailReqDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull(message="票据id不能为空")
	@ApiModelProperty(value = "票据id")
	private Long voucherId;
}
