package com.catharine.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author LZ
 * @date 2020/4/1 13:49
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
    private String id;
    private String username;
    private String password;
}
