package com.catharine.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.catharine.user.entity.CatMenu;
import com.catharine.user.vo.CatMenuVO;

import java.util.List;

/**
 *  Mapper 接口
 *
 * @author 
 * @since 2020-04-03
 */
public interface CatMenuMapper extends BaseMapper<CatMenu> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param catMenu
	 * @return
	 */
	List<CatMenuVO> selectCatMenuPage(IPage page, CatMenuVO catMenu);

}
