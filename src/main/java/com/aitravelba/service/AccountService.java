package com.aitravelba.service;

import com.aitravelba.dto.req.wechat.RegisterUserReqDto;
import com.aitravelba.dto.resp.wechat.UserInfoRespDto;

/**
 * 
 * @author swiftwen
 * @date 2018年11月26日 上午11:49:20
 */
public interface AccountService {

	/**
	 * 创建用户
	 * 
	 * @param req
	 * @return
	 */
	Long createAccount(RegisterUserReqDto req);

	/**
	 * 用户详细信息
	 * 
	 * @param id
	 * @return
	 */
	UserInfoRespDto getUserInfoDetail(long id);
	
	/**
	 * openId查找用户
	 * @param account
	 * @return
	 */
	UserInfoRespDto getUserInfoByOpenId(String openId);
	
}
