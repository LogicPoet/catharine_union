package com.catharine.auth.mapper;

import com.catharine.auth.entity.CatClient;
import com.catharine.auth.vo.CatClientVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import java.util.List;

/**
 * 客户端表 Mapper 接口
 *
 * @author 
 * @since 2020-04-03
 */
public interface CatClientMapper extends BaseMapper<CatClient> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param catClient
	 * @return
	 */
	List<CatClientVO> selectCatClientPage(IPage page, CatClientVO catClient);

}
