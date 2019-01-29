package com.aitravelba.orm.wechat;

import java.util.List;

import org.apache.shiro.authz.Permission;

/**
 * 
 * @author swiftwen
 * @date 2018年12月5日 下午2:29:20
 */
public interface PermissionMapper{
	
	List<Permission> selectByIds(List<Long> ids);
}