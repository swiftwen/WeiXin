package com.aitravelba.orm.wechat;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.aitravelba.pojo.wechat.SmOrder;

public interface SmOrderMapper{
	/**
	 * 订单列表
	 * @param params
	 * @return
	 */
	List<SmOrder> orderList(Map<String, Object> params);
	
	Integer countOrderList(Map<String, Object> params);
	
	int insert(SmOrder record);

    int insertSelective(SmOrder record);
    /**
     * 票据撤销
     * @param openId
     * @param voucherId
     * @return
     */
    Integer backVoucher(@Param("openId") String openId,@Param("id") Long id);
}