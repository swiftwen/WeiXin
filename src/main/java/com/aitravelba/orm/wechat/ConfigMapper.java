package com.aitravelba.orm.wechat;

import org.apache.ibatis.annotations.Param;

import com.aitravelba.pojo.wechat.Config;
/**
 * 
 * @author swiftwen
 * @date 2019年1月29日 下午5:10:33
 */
public interface ConfigMapper {


    int deleteByPrimaryKey(Long id);

    int insert(Config record);

    int insertSelective(Config record);

    Config selectByPrimaryKey(Long id);

    Config selectByConfigId(@Param("configId") String configId);
}