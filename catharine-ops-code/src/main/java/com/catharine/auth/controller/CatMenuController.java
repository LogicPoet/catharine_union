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
import com.catharine.auth.entity.CatMenu;
import com.catharine.auth.vo.CatMenuVO;
import com.catharine.auth.service.ICatMenuService;

/**
 *  控制器
 *
 * @author 
 * @since 2020-04-03
 */
@RestController
@AllArgsConstructor
@RequestMapping("/catmenu")
@Api(value = "", tags = "接口")
public class CatMenuController {

	private ICatMenuService catMenuService;

	/**
	 * 详情
	 */
	@GetMapping("/detail")
	@ApiOperationSupport(order = 1)
	@ApiOperation(value = "详情", notes = "传入catMenu")
	public R<CatMenu> detail(CatMenu catMenu) {
		CatMenu detail = catMenuService.getOne(Condition.getQueryWrapper(catMenu));
		return R.data(detail);
	}

	/**
	 * 分页 
	 */
	@GetMapping("/list")
	@ApiOperationSupport(order = 2)
	@ApiOperation(value = "分页", notes = "传入catMenu")
	public R<IPage<CatMenu>> list(CatMenu catMenu, Query query) {
		IPage<CatMenu> pages = catMenuService.page(Condition.getPage(query), Condition.getQueryWrapper(catMenu));
		return R.data(pages);
	}

	/**
	 * 自定义分页 
	 */
	@GetMapping("/page")
	@ApiOperationSupport(order = 3)
	@ApiOperation(value = "分页", notes = "传入catMenu")
	public R<IPage<CatMenuVO>> page(CatMenuVO catMenu, Query query) {
		IPage<CatMenuVO> pages = catMenuService.selectCatMenuPage(Condition.getPage(query), catMenu);
		return R.data(pages);
	}

	/**
	 * 新增 
	 */
	@PostMapping("/save")
	@ApiOperationSupport(order = 4)
	@ApiOperation(value = "新增", notes = "传入catMenu")
	public R save(@Valid @RequestBody CatMenu catMenu) {
		return R.status(catMenuService.save(catMenu));
	}

	/**
	 * 修改 
	 */
	@PostMapping("/update")
	@ApiOperationSupport(order = 5)
	@ApiOperation(value = "修改", notes = "传入catMenu")
	public R update(@Valid @RequestBody CatMenu catMenu) {
		return R.status(catMenuService.updateById(catMenu));
	}

	/**
	 * 新增或修改 
	 */
	@PostMapping("/submit")
	@ApiOperationSupport(order = 6)
	@ApiOperation(value = "新增或修改", notes = "传入catMenu")
	public R submit(@Valid @RequestBody CatMenu catMenu) {
		return R.status(catMenuService.saveOrUpdate(catMenu));
	}

	
	/**
	 * 删除 
	 */
	@PostMapping("/remove")
	@ApiOperationSupport(order = 8)
	@ApiOperation(value = "删除", notes = "传入ids")
	public R remove(@ApiParam(value = "主键集合", required = true) @RequestParam String ids) {
		return R.status(catMenuService.removeByIds(Func.toIntList(ids)));
	}

	
}
