package com.catharine.auth.dto;

import com.catharine.auth.entity.CatClient;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 客户端表数据传输对象实体类
 *
 * @author 
 * @since 2020-04-03
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CatClientDTO extends CatClient {
	private static final long serialVersionUID = 1L;

}
