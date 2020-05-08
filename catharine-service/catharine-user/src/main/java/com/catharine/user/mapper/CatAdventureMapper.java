package com.catharine.user.mapper;

import com.catharine.user.entity.CatAdventure;
import com.catharine.user.vo.CatAdventureVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import java.util.List;

/**
 * 冒险家表 Mapper 接口
 *
 * @author 
 * @since 2020-04-13
 */
public interface CatAdventureMapper extends BaseMapper<CatAdventure> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param catAdventure
	 * @return
	 */
	List<CatAdventureVO> selectCatAdventurePage(IPage page, CatAdventureVO catAdventure);

}
