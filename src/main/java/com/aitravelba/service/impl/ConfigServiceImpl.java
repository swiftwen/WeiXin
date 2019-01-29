package com.aitravelba.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aitravelba.orm.wechat.ConfigMapper;
import com.aitravelba.pojo.wechat.Config;
import com.aitravelba.service.ConfigService;
/**
 * 
 * @author swiftwen
 * @date 2019年1月29日 下午5:13:13
 */
@Service
public class ConfigServiceImpl implements ConfigService {

	@Autowired
	private ConfigMapper configMapper;
	
	@Override
	public Config selectByConfigId(String configId) {
		
		Config config = configMapper.selectByConfigId(configId);
		return config;
	}

}
