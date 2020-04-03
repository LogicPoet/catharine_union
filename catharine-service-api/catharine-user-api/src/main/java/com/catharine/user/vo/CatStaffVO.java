package com.catharine.user.vo;

import com.catharine.user.entity.CatStaff;
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
@ApiModel(value = "CatStaffVO对象", description = "CatStaffVO对象")
public class CatStaffVO extends CatStaff {
	private static final long serialVersionUID = 1L;

}
