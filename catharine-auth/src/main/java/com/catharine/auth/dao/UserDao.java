package com.catharine.auth.dao;

import com.catharine.auth.model.PermissionDto;
import com.catharine.auth.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LZ
 * @date 2020/4/2 12:17
 **/
@Repository
public class UserDao {

    //根据账号查询用户信息
    public UserDto getUserByUsername(String username){
        //连接数据库查询用户
        UserDto userDto=new UserDto();
        userDto.setId("1");
        userDto.setUsername("zhangsan");
        userDto.setPassword("123");
        userDto.setFullname("张三");
        userDto.setMobile("110");
        return userDto;
    }

    //根据用户id查询用户权限
    public List<String> findPermissionsByUserId(String userId){
        List<String> permissions = new ArrayList<>();
        permissions.add("r1");
        permissions.add("r2");
        return permissions;
    }
}
