package com.catharine.auth.service;

import com.alibaba.fastjson.JSON;
import com.catharine.common.support.R;
import com.catharine.user.dto.UserInfoDTO;
import com.catharine.user.feign.IUserClient;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;

/**
 * @author LZ
 * @date 2020/4/2 12:19
 **/
@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private IUserClient userClient;

    /**
     *
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //根据账号查询用户信息
        R<UserInfoDTO> userInfoDTOR= userClient.userInfo(username);
        if (userInfoDTOR.getCode()!= HttpServletResponse.SC_OK ){
            //如果用户查不到，返回null，由provider来抛出异常
            return null;
        }
        UserInfoDTO userInfo = userInfoDTOR.getData();
        //获取用户的权限
        String permissions = userInfo.getPermissions();
        String password = userInfo.getPassword();
        //将userInfo转成json
        userInfo.setPassword(null);
        String principal = JSON.toJSONString(userInfo);
        return User.withUsername(principal).password(password).authorities(permissions).build();
    }
}