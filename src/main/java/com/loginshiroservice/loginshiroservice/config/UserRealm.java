/*
package com.loginshiroservice.loginshiroservice.config;

import com.shiroproject.usershiroservice.entity.User;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
public class UserRealm extends AuthorizingRealm {


    */
/**
     * 进行授权
     * @param principals
     * @return
     *//*

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        if(ObjectUtils.isEmpty(principals)){
            throw new AuthenticationException("PrincipalCollection method argument can not be null");
        }
        User user = (User)getAvailablePrincipal(principals);
        return null;
    }

    */
/**
     * 进行认证
     * @param token
     * @return
     * @throws AuthenticationException
     *//*

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        return null;
    }
}
*/
