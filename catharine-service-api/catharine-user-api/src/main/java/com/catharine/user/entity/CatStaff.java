package com.catharine.user.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableLogic;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 实体类
 *
 * @author
 * @since 2020-04-03
 */
@Data
@ApiModel(value = "CatStaff对象", description = "CatStaff对象")
public class CatStaff implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    private Long id;
    /**
     * 账号
     */
    @ApiModelProperty(value = "账号")
    private String account;
    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;
    /**
     * 昵称
     */
    @ApiModelProperty(value = "昵称")
    private String nickname;
    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱")
    private String email;
    /**
     * 手机
     */
    @ApiModelProperty(value = "手机")
    private String phone;
    /**
     * 生日
     */
    @ApiModelProperty(value = "生日")
    private LocalDateTime birthday;
    /**
     * 性别[1:男,0:女]
     */
    @ApiModelProperty(value = "性别[1:男,0:女]")
    private Integer sex;
    /**
     * 角色id合集,以英文逗号分隔
     */
    @ApiModelProperty(value = "角色id合集,以英文逗号分隔")
    private String roleId;
    /**
     * 部门id合集,以英文逗号分隔
     */
    @ApiModelProperty(value = "部门id合集,以英文逗号分隔")
    private String deptId;
    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人")
    private Integer createUser;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;
    /**
     * 修改人
     */
    @ApiModelProperty(value = "修改人")
    private Integer updateUser;
    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;
    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
    private Integer status;
    /**
     * 是否已删除
     */
    @ApiModelProperty(value = "是否已删除")
    @TableLogic
    private Integer isDeleted;


}
