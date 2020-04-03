package com.catharine.user.vo;

import com.catharine.user.entity.CatRoleMenu;
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
@ApiModel(value = "CatRoleMenuVO对象", description = "CatRoleMenuVO对象")
public class CatRoleMenuVO extends CatRoleMenu {
	private static final long serialVersionUID = 1L;

}
