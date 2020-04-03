package com.catharine.auth.service;

import com.catharine.auth.entity.CatClient;
import com.catharine.auth.vo.CatClientVO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 客户端表 服务类
 *
 * @author 
 * @since 2020-04-03
 */
public interface ICatClientService extends IService<CatClient> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param catClient
	 * @return
	 */
	IPage<CatClientVO> selectCatClientPage(IPage<CatClientVO> page, CatClientVO catClient);

}
