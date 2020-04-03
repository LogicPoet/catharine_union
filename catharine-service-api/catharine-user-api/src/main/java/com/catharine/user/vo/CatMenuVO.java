package com.catharine.user.vo;

import com.catharine.user.entity.CatMenu;
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
@ApiModel(value = "CatMenuVO对象", description = "CatMenuVO对象")
public class CatMenuVO extends CatMenu {
    private static final long serialVersionUID = 1L;

}
