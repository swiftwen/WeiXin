package com.aitravelba.orm.wechat;

import com.aitravelba.pojo.wechat.SmUser;

public interface SmUserMapper{
	
	boolean insertSelective(SmUser user); 
	
}