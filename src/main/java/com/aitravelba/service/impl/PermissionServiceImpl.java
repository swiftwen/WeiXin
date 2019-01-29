package com.aitravelba.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.authz.Permission;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.aitravelba.dto.resp.PermissionRespDto;
import com.aitravelba.orm.wechat.PermissionMapper;
import com.aitravelba.orm.wechat.RolePermissionMapper;
import com.aitravelba.pojo.wechat.RolePermission;
import com.aitravelba.service.PermissionService;

/**
 * 
 * @author swiftwen
 * @date 2018年12月5日 下午2:41:18
 */
@Service
public class PermissionServiceImpl implements PermissionService {

	@Resource
	private PermissionMapper permissionMapper;
	@Resource
	private RolePermissionMapper rolePermissionMapper;

	@Override
	public List<PermissionRespDto> getPermissionByRoleId(List<Long> roleIdList) {
		if(null == roleIdList || roleIdList.size() <= 0){
			return null;
		}
		List<PermissionRespDto> list = new ArrayList<PermissionRespDto>();
		List<Long> permissionIds = new ArrayList<Long>();
		
		List<RolePermission> rolePermissionList = rolePermissionMapper.selectByRoleIds(roleIdList);
		for(RolePermission rolePermission : rolePermissionList) {
			permissionIds.add(rolePermission.getPermissionId());
		}
		if(null == permissionIds || permissionIds.size() <= 0) {
			return null;
		}
		List<Permission> permissionList = permissionMapper.selectByIds(permissionIds);
		for(Permission permission : permissionList) {
			PermissionRespDto dto =new PermissionRespDto();
			BeanUtils.copyProperties(permission, dto);
			list.add(dto);
		}
		return list;
	}
	
	
}
