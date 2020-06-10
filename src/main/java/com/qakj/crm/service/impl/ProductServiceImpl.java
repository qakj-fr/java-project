package com.qakj.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qakj.crm.mapper.ProductMapper;
import com.qakj.crm.pojo.Product;
import com.qakj.crm.pojo.ProductExample;
import com.qakj.crm.service.ProductService;
@Transactional
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductMapper productMapper;
	
	@Override
	public List<Product> getAllProducts() {
		ProductExample example = new ProductExample();
		List<Product> list = productMapper.selectByExample(example);
		return list;
	}

	@Override
	public int addProduct(Product product) {
		int i = productMapper.insertSelective(product);
		return i;
	}
	
}
