package com.catharine.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableLogic;

import java.io.Serializable;

import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 实体类
 *
 * @author
 * @since 2020-04-03
 */
@Data
@ApiModel(value = "CatMenu对象", description = "CatMenu对象")
public class CatMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 父级菜单
     */
    @ApiModelProperty(value = "父级菜单")
    private Integer parentId;
    /**
     * 菜单编号
     */
    @ApiModelProperty(value = "菜单编号")
    private String code;
    /**
     * 菜单名称
     */
    @ApiModelProperty(value = "菜单名称")
    private String name;
    /**
     * 菜单别名
     */
    @ApiModelProperty(value = "菜单别名")
    private String alias;
    /**
     * 请求地址
     */
    @ApiModelProperty(value = "请求地址")
    private String path;
    /**
     * 菜单资源
     */
    @ApiModelProperty(value = "菜单资源")
    private String source;
    /**
     * 排序
     */
    @ApiModelProperty(value = "排序")
    private Integer sort;
    /**
     * 菜单类型
     */
    @ApiModelProperty(value = "菜单类型")
    private Integer category;
    /**
     * 操作按钮类型
     */
    @ApiModelProperty(value = "操作按钮类型")
    private Integer action;
    /**
     * 是否打开新页面
     */
    @ApiModelProperty(value = "是否打开新页面")
    private Integer isOpen;
    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;
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
