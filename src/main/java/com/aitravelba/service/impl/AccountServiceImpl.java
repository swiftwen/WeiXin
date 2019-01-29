package com.aitravelba.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aitravelba.dto.req.wechat.RegisterUserReqDto;
import com.aitravelba.dto.resp.wechat.UserInfoRespDto;
import com.aitravelba.orm.wechat.SmUserMapper;
import com.aitravelba.pojo.wechat.SmUser;
import com.aitravelba.service.AccountService;

/**
 * 
 * @author swiftwen
 * @date 2018年11月26日 下午12:44:19
 */
@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
    private SmUserMapper userMapper;
	
	@Override
	public Long createAccount(RegisterUserReqDto req) {
		SmUser userInfo = new SmUser();
		BeanUtils.copyProperties(req, userInfo);
		userMapper.insertSelective(userInfo);
		return userInfo.getId();
	}

	@Override
	public UserInfoRespDto getUserInfoDetail(long id) {
		SmUser userInfo =  userMapper.selectByPrimaryKey(id);
		UserInfoRespDto resp = new UserInfoRespDto();
		if(null != userInfo) {
			BeanUtils.copyProperties(userInfo, resp);
		}
		return resp;
	}

	@Override
	public UserInfoRespDto getUserInfoByOpenId(String openId) {
		UserInfoRespDto userInfoRespDto = new UserInfoRespDto();
		try {
			SmUser userInfo = userMapper.selectByOpenId(openId);
			BeanUtils.copyProperties(userInfo, userInfoRespDto);
		}catch(Exception e) {
			return null;
		}
		return userInfoRespDto;
	}

}
