package com.aitravelba.dto.resp.wechat;

import java.io.Serializable;
import java.util.List;

import com.aitravelba.common.resp.PageQueryResp;

/**
 * 订单列表响应
 * @author swiftwen
 * @date 2019年1月24日 下午2:46:14
 */
public class OrderListRespDto extends PageQueryResp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<OrderListDto> list;

	public List<OrderListDto> getList() {
		return list;
	}

	public void setList(List<OrderListDto> list) {
		this.list = list;
	}

	
}
