package com.catharine.user.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableLogic;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 冒险家表实体类
 *
 * @author
 * @since 2020-04-13
 */
@Data
@ApiModel(value = "CatAdventure对象", description = "冒险家表")
public class CatAdventure implements Serializable {

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
     * 姓
     */
    @ApiModelProperty(value = "姓")
    private String familyName;
    /**
     * 名
     */
    @ApiModelProperty(value = "名")
    private String givenName;
    /**
     * 性别[1:男,0:女]
     */
    @ApiModelProperty(value = "性别[1:男,0:女]")
    private Integer sex;
    /**
     * 种族
     */
    @ApiModelProperty(value = "种族")
    private String race;
    /**
     * 出身地
     */
    @ApiModelProperty(value = "出身地")
    private String birth;
    /**
     * 出生日期
     */
    @ApiModelProperty(value = "出生日期")
    private LocalDateTime birthday;
    /**
     * 身份id
     */
    @ApiModelProperty(value = "身份id")
    private String identityId;
    /**
     * 职业
     */
    @ApiModelProperty(value = "职业")
    private String profession;
    /**
     * 基础等级
     */
    @ApiModelProperty(value = "基础等级")
    private String basicLevel;
    /**
     * 冒险家等级
     */
    @ApiModelProperty(value = "冒险家等级")
    private String adventureLevel;
    /**
     * 联络地址
     */
    @ApiModelProperty(value = "联络地址")
    private String contactAddress;
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
