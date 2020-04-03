package com.catharine.user.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author LZ
 * @date 2020/4/3 16:31
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class UserInfoDTO {
    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 权限合集
     */
    private String permissions;

}
