package com.aitravelba.orm.wechat;

import org.apache.ibatis.annotations.Param;

import com.aitravelba.pojo.wechat.RegexConfig;

public interface RegexConfigMapper {

    int insert(RegexConfig record);

    int insertSelective(RegexConfig record);

    RegexConfig selectByPrimaryKey(Long id);
    /**
     * voucherId查询正则配置
     * @param voucherId
     * @return
     */
    RegexConfig selectByVoucherId(@Param("voucherId") Long voucherId);

    int updateByPrimaryKeySelective(RegexConfig record);

    int updateByPrimaryKey(RegexConfig record);
}