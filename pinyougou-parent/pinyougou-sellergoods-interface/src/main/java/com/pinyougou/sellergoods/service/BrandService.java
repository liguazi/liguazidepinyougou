package com.pinyougou.sellergoods.service;

import java.util.List;

import com.pinyougou.pojo.TbBrand;

/**
 * 品牌服务层接口
 * @author ASUS
 *
 */
public interface BrandService {
/**
 * 		查询所有品牌
 * 		返回全部列表
 */
	public	List<TbBrand> findAll();
	
}
