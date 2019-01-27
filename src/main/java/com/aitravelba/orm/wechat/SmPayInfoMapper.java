package com.aitravelba.orm.wechat;

import java.util.Map;

import com.aitravelba.pojo.wechat.SmPayInfo;

/**
 * 
 * @author swiftwen
 * @date 2019年1月24日 下午6:50:43
 */
public interface SmPayInfoMapper{
	/**
	 * 查询收款信息
	 * @param params
	 * @return
	 */
	SmPayInfo queryPayInfo(Map<String, Object> params);
	
	/**
	 * 新增或更新收款信息
	 * @param params
	 * @return
	 */
	Integer saveOrUpdatePayInfo(SmPayInfo payInfo);
}