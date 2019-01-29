package com.aitravelba.config;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.aitravelba.dto.resp.PermissionRespDto;
import com.aitravelba.dto.resp.RoleRespDto;
import com.aitravelba.dto.resp.wechat.UserInfoRespDto;
import com.aitravelba.service.AccountService;
import com.aitravelba.service.PermissionService;
import com.aitravelba.service.RoleService;

/**
 * 
 * @author swiftwen
 * @date 2018年12月5日 上午11:13:04
 */
public class MyShiroRealm extends AuthorizingRealm{
 
	
	@Resource
	private AccountService accountService;
	@Resource
	private RoleService roleService;
	@Resource
	private PermissionService permissionService;
	
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String openId = (String)token.getPrincipal();	
		//通过username从数据库中查找 User对象，如果找到，没找到.
		//实际项目中，这里可以根据实际情况做缓存，如果不做，Shiro自己也是有时间间隔机制，2分钟内不会重复执行该方法
		UserInfoRespDto userInfo = accountService.getUserInfoByOpenId(openId);
		System.out.println(userInfo);
		if(userInfo == null){
			return null;
		}
		System.out.println("----->>userInfo="+userInfo.getNickName()+"---");
		
        //String pwd = accountService.getPwdByAccount(username);
        String pwd = openId;
      SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
    		 userInfo, //用户名
    		 pwd, //密码
             getName()  //realm name
      );
		
		return authenticationInfo;
	}
	
	
 
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
 
		System.out.println("权限配置-->MyShiroRealm.doGetAuthorizationInfo()");
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		UserInfoRespDto userInfo  = (UserInfoRespDto)principals.getPrimaryPrincipal();
//		userInfo userInfo= userInfoService.findByUsername(username);
		long uid=userInfo.getId();
		List<RoleRespDto> roleList = roleService.getRoleByUserId(uid);
		//List<userrole> list=userRoleDao.getRoles(uid);
		List<Long> roleIdList = new ArrayList<Long>();
		for(RoleRespDto roleRespDto : roleList){
			long roleId=roleRespDto.getId();
			authorizationInfo.addRole(roleRespDto.getRole());
			System.out.println("role name: " + roleRespDto.getRole());
			
			roleIdList.add(roleId);
			
		}
 
		List<PermissionRespDto> permissionList = permissionService.getPermissionByRoleId(roleIdList);
		for(PermissionRespDto p:permissionList){
			
			authorizationInfo.addStringPermission(p.getPermissionName());
			System.out.println("permission name : "+p.getPermissionName());
		}
 
		return authorizationInfo;
	}
	
 
}
 

