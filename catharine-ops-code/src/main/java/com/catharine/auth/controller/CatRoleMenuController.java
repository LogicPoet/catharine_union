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
import com.catharine.auth.entity.CatRoleMenu;
import com.catharine.auth.vo.CatRoleMenuVO;
import com.catharine.auth.service.ICatRoleMenuService;

/**
 *  控制器
 *
 * @author 
 * @since 2020-04-03
 */
@RestController
@AllArgsConstructor
@RequestMapping("/catrolemenu")
@Api(value = "", tags = "接口")
public class CatRoleMenuController {

	private ICatRoleMenuService catRoleMenuService;

	/**
	 * 详情
	 */
	@GetMapping("/detail")
	@ApiOperationSupport(order = 1)
	@ApiOperation(value = "详情", notes = "传入catRoleMenu")
	public R<CatRoleMenu> detail(CatRoleMenu catRoleMenu) {
		CatRoleMenu detail = catRoleMenuService.getOne(Condition.getQueryWrapper(catRoleMenu));
		return R.data(detail);
	}

	/**
	 * 分页 
	 */
	@GetMapping("/list")
	@ApiOperationSupport(order = 2)
	@ApiOperation(value = "分页", notes = "传入catRoleMenu")
	public R<IPage<CatRoleMenu>> list(CatRoleMenu catRoleMenu, Query query) {
		IPage<CatRoleMenu> pages = catRoleMenuService.page(Condition.getPage(query), Condition.getQueryWrapper(catRoleMenu));
		return R.data(pages);
	}

	/**
	 * 自定义分页 
	 */
	@GetMapping("/page")
	@ApiOperationSupport(order = 3)
	@ApiOperation(value = "分页", notes = "传入catRoleMenu")
	public R<IPage<CatRoleMenuVO>> page(CatRoleMenuVO catRoleMenu, Query query) {
		IPage<CatRoleMenuVO> pages = catRoleMenuService.selectCatRoleMenuPage(Condition.getPage(query), catRoleMenu);
		return R.data(pages);
	}

	/**
	 * 新增 
	 */
	@PostMapping("/save")
	@ApiOperationSupport(order = 4)
	@ApiOperation(value = "新增", notes = "传入catRoleMenu")
	public R save(@Valid @RequestBody CatRoleMenu catRoleMenu) {
		return R.status(catRoleMenuService.save(catRoleMenu));
	}

	/**
	 * 修改 
	 */
	@PostMapping("/update")
	@ApiOperationSupport(order = 5)
	@ApiOperation(value = "修改", notes = "传入catRoleMenu")
	public R update(@Valid @RequestBody CatRoleMenu catRoleMenu) {
		return R.status(catRoleMenuService.updateById(catRoleMenu));
	}

	/**
	 * 新增或修改 
	 */
	@PostMapping("/submit")
	@ApiOperationSupport(order = 6)
	@ApiOperation(value = "新增或修改", notes = "传入catRoleMenu")
	public R submit(@Valid @RequestBody CatRoleMenu catRoleMenu) {
		return R.status(catRoleMenuService.saveOrUpdate(catRoleMenu));
	}

	
	/**
	 * 删除 
	 */
	@PostMapping("/remove")
	@ApiOperationSupport(order = 8)
	@ApiOperation(value = "删除", notes = "传入ids")
	public R remove(@ApiParam(value = "主键集合", required = true) @RequestParam String ids) {
		return R.status(catRoleMenuService.removeByIds(Func.toIntList(ids)));
	}

	
}
