package com.aitravelba.orm.wechat;

import java.util.List;

import com.aitravelba.pojo.wechat.Role;

/**
 * 
 * @author swiftwen
 * @date 2018年12月5日 下午2:29:38
 */
public interface RoleMapper{
	
	List<Role> selectByIds(List<Long> ids);
}