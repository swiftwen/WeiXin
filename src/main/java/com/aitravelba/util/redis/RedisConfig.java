package com.aitravelba.util.redis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
/**
 * @desc jedis
 * @Author wenpeng
 * @2018年3月26日 上午9:47:00
 */
@Configuration
public class RedisConfig {

	@Value("${spring.redis.host}")
	private String redisHost;
	@Value("${spring.redis.port}")
	private Integer redisPort;
	@Value("${spring.redis.password}")
	private String redisPwd;
	
	@Bean
	public RedisConnectionFactory redisCF() {
		//默认6379端口
		JedisConnectionFactory factory = new JedisConnectionFactory();
		factory.setPort(redisPort);
		factory.setHostName(redisHost);
		factory.setPassword(redisPwd);
		return factory;
	}

	@Bean
	public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
		//创建一个模板类
		RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
		//将刚才的redis连接工厂设置到模板类中
		template.setConnectionFactory(factory);
		return template;
	}

}
