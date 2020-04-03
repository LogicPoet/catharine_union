package com.catharine.user.mapper;

import com.catharine.user.entity.CatRoleMenu;
import com.catharine.user.vo.CatRoleMenuVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import java.util.List;

/**
 *  Mapper 接口
 *
 * @author 
 * @since 2020-04-03
 */
public interface CatRoleMenuMapper extends BaseMapper<CatRoleMenu> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param catRoleMenu
	 * @return
	 */
	List<CatRoleMenuVO> selectCatRoleMenuPage(IPage page, CatRoleMenuVO catRoleMenu);

}
