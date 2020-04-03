package com.catharine.user.service;

import com.catharine.user.entity.CatRoleMenu;
import com.catharine.user.vo.CatRoleMenuVO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 *  服务类
 *
 * @author 
 * @since 2020-04-03
 */
public interface ICatRoleMenuService extends IService<CatRoleMenu> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param catRoleMenu
	 * @return
	 */
	IPage<CatRoleMenuVO> selectCatRoleMenuPage(IPage<CatRoleMenuVO> page, CatRoleMenuVO catRoleMenu);

}
