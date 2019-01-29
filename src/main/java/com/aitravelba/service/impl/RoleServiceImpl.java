package com.aitravelba.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.aitravelba.dto.resp.RoleRespDto;
import com.aitravelba.orm.wechat.RoleMapper;
import com.aitravelba.orm.wechat.UserRoleMapper;
import com.aitravelba.pojo.wechat.Role;
import com.aitravelba.pojo.wechat.UserRole;
import com.aitravelba.service.RoleService;

/**
 * 
 * @author swiftwen
 * @date 2018年12月5日 下午2:39:45
 */
@Service
public class RoleServiceImpl implements RoleService {

	
	@Resource
	private UserRoleMapper userRoleMapper;
	
	@Resource
	private RoleMapper roleMapper;
	
	@Override
	public List<RoleRespDto> getRoleByUserId(Long userId) {
		List<RoleRespDto> list = new ArrayList<RoleRespDto>();
	
		List<UserRole> userRoleList = userRoleMapper.getRoleByUserId(userId);
		List<Long> ids = new ArrayList<Long>();
		for(UserRole userRole : userRoleList) {
			ids.add(userRole.getRoleId());
		}
		if(null == ids || ids.size() <= 0) {
			return null;
		}
		
		List<Role> roleList = roleMapper.selectByIds(ids);
		for(Role role : roleList) {
			RoleRespDto dto = new RoleRespDto();
			BeanUtils.copyProperties(role, dto);
			list.add(dto);
		}
		return list;
	}
}
