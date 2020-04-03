package com.catharine.user.service.impl;

import com.catharine.user.entity.CatMenu;
import com.catharine.user.vo.CatMenuVO;
import com.catharine.user.mapper.CatMenuMapper;
import com.catharine.user.service.ICatMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 *  服务实现类
 *
 * @author 
 * @since 2020-04-03
 */
@Service
public class CatMenuServiceImpl extends ServiceImpl<CatMenuMapper, CatMenu> implements ICatMenuService {

	@Override
	public IPage<CatMenuVO> selectCatMenuPage(IPage<CatMenuVO> page, CatMenuVO catMenu) {
		return page.setRecords(baseMapper.selectCatMenuPage(page, catMenu));
	}

}
