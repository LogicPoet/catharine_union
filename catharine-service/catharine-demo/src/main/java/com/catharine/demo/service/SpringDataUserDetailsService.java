package com.catharine.demo.service;

import com.catharine.demo.model.UserDto;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author LZ
 * @date 2020/4/1 13:39
 **/
@Service
public class SpringDataUserDetailsService implements UserDetailsService {

    /**
     * 根据 账号查询用户信息
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Map<String,UserDto> userMap=new HashMap<>();

        UserDto user1=new UserDto("1","lili","123");
        userMap.put("lili",user1);
        UserDto user2=new UserDto("1","bibi","123");
        userMap.put("bibi",user2);
        UserDto user3=new UserDto("1","cici","123");
        userMap.put("cici",user3);

        //将来连接数据库根据账号查询用户信息
        if(!userMap.containsKey(username)){
            //如果用户查不到，返回null，由provider来抛出异常
            return null;
        }
        UserDto userDto = userMap.get(username);
        //根据用户的id查询用户的权限
        //将permissions转成数组
        String[] permissionArray = {"p1","p2"};

        UserDetails userDetails = User.withUsername(userDto.getUsername()).password(userDto.getPassword()).authorities(permissionArray).build();
        return userDetails;
    }
}
