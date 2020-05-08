package com.catharine.user.service;

import com.catharine.user.entity.CatAdventure;
import com.catharine.user.vo.CatAdventureVO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 冒险家表 服务类
 *
 * @author 
 * @since 2020-04-13
 */
public interface ICatAdventureService extends IService<CatAdventure> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param catAdventure
	 * @return
	 */
	IPage<CatAdventureVO> selectCatAdventurePage(IPage<CatAdventureVO> page, CatAdventureVO catAdventure);

}
