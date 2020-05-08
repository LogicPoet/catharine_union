package com.catharine.user.vo;

import com.catharine.user.entity.CatAdventure;
import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;

/**
 * 冒险家表视图实体类
 *
 * @author 
 * @since 2020-04-13
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "CatAdventureVO对象", description = "冒险家表")
public class CatAdventureVO extends CatAdventure {
	private static final long serialVersionUID = 1L;

}
