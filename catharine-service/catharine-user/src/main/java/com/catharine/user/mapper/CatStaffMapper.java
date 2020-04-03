package com.catharine.user.mapper;

import com.catharine.user.entity.CatStaff;
import com.catharine.user.vo.CatStaffVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import java.util.List;

/**
 *  Mapper 接口
 *
 * @author 
 * @since 2020-04-03
 */
public interface CatStaffMapper extends BaseMapper<CatStaff> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param catStaff
	 * @return
	 */
	List<CatStaffVO> selectCatStaffPage(IPage page, CatStaffVO catStaff);

}
