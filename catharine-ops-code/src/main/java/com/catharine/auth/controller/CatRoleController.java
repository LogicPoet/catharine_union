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
import com.catharine.auth.entity.CatRole;
import com.catharine.auth.vo.CatRoleVO;
import com.catharine.auth.service.ICatRoleService;

/**
 *  控制器
 *
 * @author 
 * @since 2020-04-03
 */
@RestController
@AllArgsConstructor
@RequestMapping("/catrole")
@Api(value = "", tags = "接口")
public class CatRoleController {

	private ICatRoleService catRoleService;

	/**
	 * 详情
	 */
	@GetMapping("/detail")
	@ApiOperationSupport(order = 1)
	@ApiOperation(value = "详情", notes = "传入catRole")
	public R<CatRole> detail(CatRole catRole) {
		CatRole detail = catRoleService.getOne(Condition.getQueryWrapper(catRole));
		return R.data(detail);
	}

	/**
	 * 分页 
	 */
	@GetMapping("/list")
	@ApiOperationSupport(order = 2)
	@ApiOperation(value = "分页", notes = "传入catRole")
	public R<IPage<CatRole>> list(CatRole catRole, Query query) {
		IPage<CatRole> pages = catRoleService.page(Condition.getPage(query), Condition.getQueryWrapper(catRole));
		return R.data(pages);
	}

	/**
	 * 自定义分页 
	 */
	@GetMapping("/page")
	@ApiOperationSupport(order = 3)
	@ApiOperation(value = "分页", notes = "传入catRole")
	public R<IPage<CatRoleVO>> page(CatRoleVO catRole, Query query) {
		IPage<CatRoleVO> pages = catRoleService.selectCatRolePage(Condition.getPage(query), catRole);
		return R.data(pages);
	}

	/**
	 * 新增 
	 */
	@PostMapping("/save")
	@ApiOperationSupport(order = 4)
	@ApiOperation(value = "新增", notes = "传入catRole")
	public R save(@Valid @RequestBody CatRole catRole) {
		return R.status(catRoleService.save(catRole));
	}

	/**
	 * 修改 
	 */
	@PostMapping("/update")
	@ApiOperationSupport(order = 5)
	@ApiOperation(value = "修改", notes = "传入catRole")
	public R update(@Valid @RequestBody CatRole catRole) {
		return R.status(catRoleService.updateById(catRole));
	}

	/**
	 * 新增或修改 
	 */
	@PostMapping("/submit")
	@ApiOperationSupport(order = 6)
	@ApiOperation(value = "新增或修改", notes = "传入catRole")
	public R submit(@Valid @RequestBody CatRole catRole) {
		return R.status(catRoleService.saveOrUpdate(catRole));
	}

	
	/**
	 * 删除 
	 */
	@PostMapping("/remove")
	@ApiOperationSupport(order = 8)
	@ApiOperation(value = "删除", notes = "传入ids")
	public R remove(@ApiParam(value = "主键集合", required = true) @RequestParam String ids) {
		return R.status(catRoleService.removeByIds(Func.toIntList(ids)));
	}

	
}
