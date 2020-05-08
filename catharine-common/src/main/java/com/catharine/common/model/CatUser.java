package com.catharine.common.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>Title: CatUser</p>
 * <p>description: 从token中解析出来的用户信息</p>
 * <p>Company: </p>
 *
 * @author LZ
 * @date 2020/4/8 22:16
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatUser implements Serializable {
    private static final long serialVersionUID = 1L;

    public CatUser(String roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    /**
     * 客户端id
     */
    @ApiModelProperty(hidden = true)
    private String clientId;

    /**
     * 用户id
     */
    @ApiModelProperty(hidden = true)
    private Integer userId;
    /**
     * 租户ID
     */
    @ApiModelProperty(hidden = true)
    private String tenantId;
    /**
     * 昵称
     */
    @ApiModelProperty(hidden = true)
    private String userName;
    /**
     * 账号
     */
    @ApiModelProperty(hidden = true)
    private String account;
    /**
     * 角色id
     */
    @ApiModelProperty(hidden = true)
    private String roleId;
    /**
     * 角色名
     */
    @ApiModelProperty(hidden = true)
    private String roleName;
}
