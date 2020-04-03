package com.catharine.user.dto;

import com.catharine.user.entity.CatStaff;
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
public class CatStaffDTO extends CatStaff {
	private static final long serialVersionUID = 1L;

}
