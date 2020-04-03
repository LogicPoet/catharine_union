package com.catharine.user.service;

import com.catharine.user.entity.CatRole;
import com.catharine.user.vo.CatRoleVO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 *  服务类
 *
 * @author 
 * @since 2020-04-03
 */
public interface ICatRoleService extends IService<CatRole> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param catRole
	 * @return
	 */
	IPage<CatRoleVO> selectCatRolePage(IPage<CatRoleVO> page, CatRoleVO catRole);

}
