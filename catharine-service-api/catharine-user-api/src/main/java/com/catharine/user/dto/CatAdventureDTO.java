package com.catharine.user.dto;

import com.catharine.user.entity.CatAdventure;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 冒险家表数据传输对象实体类
 *
 * @author 
 * @since 2020-04-13
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CatAdventureDTO extends CatAdventure {
	private static final long serialVersionUID = 1L;

}
