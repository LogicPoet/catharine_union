package com.catharine.user.service.impl;

import com.catharine.user.entity.CatRoleMenu;
import com.catharine.user.vo.CatRoleMenuVO;
import com.catharine.user.mapper.CatRoleMenuMapper;
import com.catharine.user.service.ICatRoleMenuService;
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
public class CatRoleMenuServiceImpl extends ServiceImpl<CatRoleMenuMapper, CatRoleMenu> implements ICatRoleMenuService {

	@Override
	public IPage<CatRoleMenuVO> selectCatRoleMenuPage(IPage<CatRoleMenuVO> page, CatRoleMenuVO catRoleMenu) {
		return page.setRecords(baseMapper.selectCatRoleMenuPage(page, catRoleMenu));
	}

}
