package com.catharine.auth.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import lombok.AllArgsConstructor;
import javax.validation.Valid;

import org.springblade.core.mp.support.Condition;
import org.springblade.core.mp.support.Query;
import org.springblade.core.tool.api.R;
import org.springblade.core.tool.utils.Func;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.catharine.auth.entity.CatStaff;
import com.catharine.auth.vo.CatStaffVO;
import com.catharine.auth.service.ICatStaffService;

/**
 *  控制器
 *
 * @author 
 * @since 2020-04-03
 */
@RestController
@AllArgsConstructor
@RequestMapping("/catstaff")
@Api(value = "", tags = "接口")
public class CatStaffController {

	private ICatStaffService catStaffService;

	/**
	 * 详情
	 */
	@GetMapping("/detail")
	@ApiOperationSupport(order = 1)
	@ApiOperation(value = "详情", notes = "传入catStaff")
	public R<CatStaff> detail(CatStaff catStaff) {
		CatStaff detail = catStaffService.getOne(Condition.getQueryWrapper(catStaff));
		return R.data(detail);
	}

	/**
	 * 分页 
	 */
	@GetMapping("/list")
	@ApiOperationSupport(order = 2)
	@ApiOperation(value = "分页", notes = "传入catStaff")
	public R<IPage<CatStaff>> list(CatStaff catStaff, Query query) {
		IPage<CatStaff> pages = catStaffService.page(Condition.getPage(query), Condition.getQueryWrapper(catStaff));
		return R.data(pages);
	}

	/**
	 * 自定义分页 
	 */
	@GetMapping("/page")
	@ApiOperationSupport(order = 3)
	@ApiOperation(value = "分页", notes = "传入catStaff")
	public R<IPage<CatStaffVO>> page(CatStaffVO catStaff, Query query) {
		IPage<CatStaffVO> pages = catStaffService.selectCatStaffPage(Condition.getPage(query), catStaff);
		return R.data(pages);
	}

	/**
	 * 新增 
	 */
	@PostMapping("/save")
	@ApiOperationSupport(order = 4)
	@ApiOperation(value = "新增", notes = "传入catStaff")
	public R save(@Valid @RequestBody CatStaff catStaff) {
		return R.status(catStaffService.save(catStaff));
	}

	/**
	 * 修改 
	 */
	@PostMapping("/update")
	@ApiOperationSupport(order = 5)
	@ApiOperation(value = "修改", notes = "传入catStaff")
	public R update(@Valid @RequestBody CatStaff catStaff) {
		return R.status(catStaffService.updateById(catStaff));
	}

	/**
	 * 新增或修改 
	 */
	@PostMapping("/submit")
	@ApiOperationSupport(order = 6)
	@ApiOperation(value = "新增或修改", notes = "传入catStaff")
	public R submit(@Valid @RequestBody CatStaff catStaff) {
		return R.status(catStaffService.saveOrUpdate(catStaff));
	}

	
	/**
	 * 删除 
	 */
	@PostMapping("/remove")
	@ApiOperationSupport(order = 8)
	@ApiOperation(value = "删除", notes = "传入ids")
	public R remove(@ApiParam(value = "主键集合", required = true) @RequestParam String ids) {
		return R.status(catStaffService.removeByIds(Func.toIntList(ids)));
	}

	
}
