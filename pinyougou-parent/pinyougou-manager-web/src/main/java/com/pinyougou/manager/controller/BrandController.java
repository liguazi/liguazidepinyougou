package com.pinyougou.manager.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
/**
 * 品牌的控制器
 * @author ASUS
 *
 */
@RestController
@RequestMapping("/brand")
public class BrandController {
	@Reference
	private BrandService brandService;

	/**
	 * 查询所有品牌
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbBrand> findAll() {
//		ModelAndView mv = new ModelAndView();
		//List<TbBrand> all = brandService.findAll();
//		List<TbBrand> all = brandService.findAll();
//		mv.addObject(all);
//		mv.setViewName("");
		return brandService.findAll();
	}
}
