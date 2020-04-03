package com.catharine.user.service;

import com.catharine.user.entity.CatMenu;
import com.catharine.user.vo.CatMenuVO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 *  服务类
 *
 * @author 
 * @since 2020-04-03
 */
public interface ICatMenuService extends IService<CatMenu> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param catMenu
	 * @return
	 */
	IPage<CatMenuVO> selectCatMenuPage(IPage<CatMenuVO> page, CatMenuVO catMenu);

}
