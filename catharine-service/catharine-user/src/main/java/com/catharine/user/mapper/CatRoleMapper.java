package com.catharine.user.mapper;

import com.catharine.user.entity.CatRole;
import com.catharine.user.vo.CatRoleVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import java.util.List;

/**
 *  Mapper 接口
 *
 * @author 
 * @since 2020-04-03
 */
public interface CatRoleMapper extends BaseMapper<CatRole> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param catRole
	 * @return
	 */
	List<CatRoleVO> selectCatRolePage(IPage page, CatRoleVO catRole);

}
