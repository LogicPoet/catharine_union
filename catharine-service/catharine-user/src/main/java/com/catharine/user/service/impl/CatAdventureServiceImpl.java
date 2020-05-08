package com.catharine.user.service.impl;

import com.catharine.user.entity.CatAdventure;
import com.catharine.user.vo.CatAdventureVO;
import com.catharine.user.mapper.CatAdventureMapper;
import com.catharine.user.service.ICatAdventureService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 冒险家表 服务实现类
 *
 * @author 
 * @since 2020-04-13
 */
@Service
public class CatAdventureServiceImpl extends ServiceImpl<CatAdventureMapper, CatAdventure> implements ICatAdventureService {

	@Override
	public IPage<CatAdventureVO> selectCatAdventurePage(IPage<CatAdventureVO> page, CatAdventureVO catAdventure) {
		return page.setRecords(baseMapper.selectCatAdventurePage(page, catAdventure));
	}

}
