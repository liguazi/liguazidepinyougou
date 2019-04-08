package com.pinyougou.sellergoods.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;

/**
 * 品牌服务层接口的实现类
 * @author ASUS
 *
 */
@Service
public class BrandServiceImpl implements BrandService{
	//品牌持久层对象引用
	@Autowired
	private TbBrandMapper brandMapper;
	/**
	 * 查询所有品牌
	 * 返回全部列表
	 */
	@Override
	public List<TbBrand> findAll() {
		return brandMapper.selectByExample(null);
	}

}
