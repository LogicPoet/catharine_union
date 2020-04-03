package com.catharine.user.service.impl;

import com.catharine.user.entity.CatRole;
import com.catharine.user.vo.CatRoleVO;
import com.catharine.user.mapper.CatRoleMapper;
import com.catharine.user.service.ICatRoleService;
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
public class CatRoleServiceImpl extends ServiceImpl<CatRoleMapper, CatRole> implements ICatRoleService {

	@Override
	public IPage<CatRoleVO> selectCatRolePage(IPage<CatRoleVO> page, CatRoleVO catRole) {
		return page.setRecords(baseMapper.selectCatRolePage(page, catRole));
	}

}
