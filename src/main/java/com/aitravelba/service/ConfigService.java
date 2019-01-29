package com.aitravelba.service;

import com.aitravelba.pojo.wechat.Config;

/**
 * 
 * @author swiftwen
 * @date 2019年1月29日 下午5:12:20
 */
public interface ConfigService {

	/**
	 * configid查询配置
	 * @param configId
	 * @return
	 */
	Config selectByConfigId(String configId);
}
