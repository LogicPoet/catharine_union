package com.catharine.user.service.impl;

import com.catharine.user.entity.CatStaff;
import com.catharine.user.vo.CatStaffVO;
import com.catharine.user.mapper.CatStaffMapper;
import com.catharine.user.service.ICatStaffService;
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
public class CatStaffServiceImpl extends ServiceImpl<CatStaffMapper, CatStaff> implements ICatStaffService {

	@Override
	public IPage<CatStaffVO> selectCatStaffPage(IPage<CatStaffVO> page, CatStaffVO catStaff) {
		return page.setRecords(baseMapper.selectCatStaffPage(page, catStaff));
	}

}
