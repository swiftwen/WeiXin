package com.aitravelba.orm.wechat;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.aitravelba.pojo.wechat.SmVoucher;
import com.aitravelba.pojo.wechat.SmVoucherEx;

/**
 * 
 * @author swiftwen
 * @date 2019年1月24日 下午7:04:33
 */
public interface SmVoucherMapper{
	
	List<SmVoucherEx> voucherList(Map<String, Object> params);
	
	
	Integer countVoucherList(Map<String, Object> params);
	
	SmVoucher selectByPrimaryKey(Long id);
	
	List<SmVoucher> selectVoucherListByIds(@Param("list") List<Long> ids);
}