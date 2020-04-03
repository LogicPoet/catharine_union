package com.catharine.auth.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableLogic;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 客户端表实体类
 *
 * @author 
 * @since 2020-04-03
 */
@Data
@ApiModel(value = "CatClient对象", description = "客户端表")
public class CatClient implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
  private Integer id;
    /**
     * 客户端id
     */
    @ApiModelProperty(value = "客户端id")
    private String clientId;
    /**
     * 客户端密钥
     */
    @ApiModelProperty(value = "客户端密钥")
    private String clientSecret;
    /**
     * 资源集合
     */
    @ApiModelProperty(value = "资源集合")
    private String resourceIds;
    /**
     * 授权范围
     */
    @ApiModelProperty(value = "授权范围")
    private String scope;
    /**
     * 授权类型
     */
    @ApiModelProperty(value = "授权类型")
    private String authorizedGrantTypes;
    /**
     * 回调地址
     */
    @ApiModelProperty(value = "回调地址")
    private String webServerRedirectUri;
    /**
     * 权限
     */
    @ApiModelProperty(value = "权限")
    private String authorities;
    /**
     * 令牌过期秒数
     */
    @ApiModelProperty(value = "令牌过期秒数")
    private Integer accessTokenValidity;
    /**
     * 刷新令牌过期秒数
     */
    @ApiModelProperty(value = "刷新令牌过期秒数")
    private Integer refreshTokenValidity;
    /**
     * 附加说明
     */
    @ApiModelProperty(value = "附加说明")
    private String additionalInformation;
    /**
     * 自动授权
     */
    @ApiModelProperty(value = "自动授权")
    private String autoApprove;
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
