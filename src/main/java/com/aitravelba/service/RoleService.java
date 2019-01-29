package com.aitravelba.service;

import java.util.List;

import com.aitravelba.dto.resp.RoleRespDto;

/**
 * 
 * @author swiftwen
 * @date 2018年12月5日 下午2:31:29
 */
public interface RoleService {

	List<RoleRespDto> getRoleByUserId(Long userId);
	
}
