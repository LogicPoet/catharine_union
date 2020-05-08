package com.catharine.user.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catharine.common.support.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.catharine.user.vo.CatAdventureVO;
import com.catharine.user.service.ICatAdventureService;

/**
 * 冒险家表 控制器
 *
 * @author 
 * @since 2020-04-13
 */
@RestController
@AllArgsConstructor
@RequestMapping("/adventure")
@Api(value = "冒险家表", tags = "冒险家表接口")
public class CatAdventureController {

	private ICatAdventureService catAdventureService;

	///**
	// * 详情
	// */
	//@GetMapping("/detail")
	//@ApiOperationSupport(order = 1)
	//@ApiOperation(value = "详情", notes = "传入catAdventure")
	//public R<CatAdventure> detail(CatAdventure catAdventure) {
	//	CatAdventure detail = catAdventureService.getOne(Condition.getQueryWrapper(catAdventure));
	//	return R.data(detail);
	//}
	//
	///**
	// * 分页 冒险家表
	// */
	//@GetMapping("/list")
	//@ApiOperationSupport(order = 2)
	//@ApiOperation(value = "分页", notes = "传入catAdventure")
	//public R<IPage<CatAdventure>> list(CatAdventure catAdventure, Query query) {
	//	IPage<CatAdventure> pages = catAdventureService.page(Condition.getPage(query), Condition.getQueryWrapper(catAdventure));
	//	return R.data(pages);
	//}
	//
	/**
	 * 自定义分页 冒险家表
	 */
	@GetMapping("/page")
	@ApiOperationSupport(order = 3)
	@ApiOperation(value = "分页", notes = "传入catAdventure")
	public R<IPage<CatAdventureVO>> page(CatAdventureVO catAdventure, Page<CatAdventureVO> iPage) {
		IPage<CatAdventureVO> pages = catAdventureService.selectCatAdventurePage(iPage, catAdventure);
		return R.data(pages);
	}
	//
	///**
	// * 新增 冒险家表
	// */
	//@PostMapping("/save")
	//@ApiOperationSupport(order = 4)
	//@ApiOperation(value = "新增", notes = "传入catAdventure")
	//public R save(@Valid @RequestBody CatAdventure catAdventure) {
	//	return R.status(catAdventureService.save(catAdventure));
	//}
	//
	///**
	// * 修改 冒险家表
	// */
	//@PostMapping("/update")
	//@ApiOperationSupport(order = 5)
	//@ApiOperation(value = "修改", notes = "传入catAdventure")
	//public R update(@Valid @RequestBody CatAdventure catAdventure) {
	//	return R.status(catAdventureService.updateById(catAdventure));
	//}
	//
	///**
	// * 新增或修改 冒险家表
	// */
	//@PostMapping("/submit")
	//@ApiOperationSupport(order = 6)
	//@ApiOperation(value = "新增或修改", notes = "传入catAdventure")
	//public R submit(@Valid @RequestBody CatAdventure catAdventure) {
	//	return R.status(catAdventureService.saveOrUpdate(catAdventure));
	//}
	//
	//
	///**
	// * 删除 冒险家表
	// */
	//@PostMapping("/remove")
	//@ApiOperationSupport(order = 8)
	//@ApiOperation(value = "删除", notes = "传入ids")
	//public R remove(@ApiParam(value = "主键集合", required = true) @RequestParam String ids) {
	//	return R.status(catAdventureService.removeByIds(Func.toIntList(ids)));
	//}
	//
	//
}
