package com.aitravelba.dto.resp.wechat;

import java.io.Serializable;
import java.util.List;

import com.aitravelba.common.resp.PageQueryResp;

import lombok.Data;
/**
 * 
 * @author swiftwen
 * @date 2019年1月24日 下午7:30:35
 */
@Data
public class VoucherListRespDto extends PageQueryResp implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<VoucherDto> list;
	
	
}
