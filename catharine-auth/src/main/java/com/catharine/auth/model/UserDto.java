package com.catharine.auth.model;

import lombok.Data;

/**
 * @author LZ
 * @date 2020/4/2 12:18
 **/
@Data
public class UserDto {
    private String id;
    private String username;
    private String password;
    private String fullname;
    private String mobile;
}
