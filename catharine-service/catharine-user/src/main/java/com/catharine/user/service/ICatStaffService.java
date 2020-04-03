package com.catharine.user.service;

import com.catharine.user.entity.CatStaff;
import com.catharine.user.vo.CatStaffVO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 *  服务类
 *
 * @author 
 * @since 2020-04-03
 */
public interface ICatStaffService extends IService<CatStaff> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param catStaff
	 * @return
	 */
	IPage<CatStaffVO> selectCatStaffPage(IPage<CatStaffVO> page, CatStaffVO catStaff);

}
