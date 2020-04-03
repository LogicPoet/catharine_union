package com.catharine.user.dto;

import com.catharine.user.entity.CatRoleMenu;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 数据传输对象实体类
 *
 * @author 
 * @since 2020-04-03
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CatRoleMenuDTO extends CatRoleMenu {
	private static final long serialVersionUID = 1L;

}
