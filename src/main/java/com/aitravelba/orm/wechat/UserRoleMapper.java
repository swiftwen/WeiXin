package com.aitravelba.orm.wechat;

import java.util.List;

import com.aitravelba.pojo.wechat.UserRole;

/**
 * 
 * @author swiftwen
 * @date 2018年12月5日 下午2:29:58
 */
public interface UserRoleMapper{
	
	List<UserRole> getRoleByUserId(Long userId);
}