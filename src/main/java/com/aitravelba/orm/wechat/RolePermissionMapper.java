package com.aitravelba.orm.wechat;

import java.util.List;

import com.aitravelba.pojo.wechat.RolePermission;

/**
 * 
 * @author swiftwen
 * @date 2018年12月5日 下午2:29:48
 */
public interface RolePermissionMapper{
	
	List<RolePermission> selectByRoleIds(List<Long> roleIdList);
}