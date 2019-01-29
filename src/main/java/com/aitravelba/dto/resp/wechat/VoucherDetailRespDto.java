package com.aitravelba.dto.resp.wechat;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * 
 * @author swiftwen
 * @date 2019年1月25日 上午10:44:53
 */
@Data
public class VoucherDetailRespDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value = "票据名称")
	private String title;
	@ApiModelProperty(value = "价格")
	private Double price;

	@ApiModelProperty(value = "来源及提醒")
	private List<String> source;
	
	
}
