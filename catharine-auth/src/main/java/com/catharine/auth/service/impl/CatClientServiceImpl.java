package com.catharine.auth.service.impl;

import com.catharine.auth.entity.CatClient;
import com.catharine.auth.vo.CatClientVO;
import com.catharine.auth.mapper.CatClientMapper;
import com.catharine.auth.service.ICatClientService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 客户端表 服务实现类
 *
 * @author 
 * @since 2020-04-03
 */
@Service
public class CatClientServiceImpl extends ServiceImpl<CatClientMapper, CatClient> implements ICatClientService {

	@Override
	public IPage<CatClientVO> selectCatClientPage(IPage<CatClientVO> page, CatClientVO catClient) {
		return page.setRecords(baseMapper.selectCatClientPage(page, catClient));
	}

}
