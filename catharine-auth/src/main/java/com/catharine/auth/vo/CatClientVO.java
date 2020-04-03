package com.catharine.auth.vo;

import com.catharine.auth.entity.CatClient;
import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;

/**
 * 客户端表视图实体类
 *
 * @author 
 * @since 2020-04-03
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "CatClientVO对象", description = "客户端表")
public class CatClientVO extends CatClient {
	private static final long serialVersionUID = 1L;

}
