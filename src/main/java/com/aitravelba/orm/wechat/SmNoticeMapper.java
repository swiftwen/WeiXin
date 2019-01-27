package com.aitravelba.orm.wechat;

import com.aitravelba.pojo.wechat.SmNotice;

public interface SmNoticeMapper {

    int insert(SmNotice record);

    int insertSelective(SmNotice record);

    SmNotice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmNotice record);
    
    SmNotice selectNewerNotice();

}