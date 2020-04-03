package com.catharine.user.vo;

import com.catharine.user.entity.CatRole;
import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;

/**
 * 视图实体类
 *
 * @author 
 * @since 2020-04-03
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "CatRoleVO对象", description = "CatRoleVO对象")
public class CatRoleVO extends CatRole {
	private static final long serialVersionUID = 1L;

}
