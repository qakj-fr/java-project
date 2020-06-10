package com.qakj.crm.service;

import java.util.List;

import com.qakj.crm.pojo.Product;

public interface ProductService {
	List<Product> getAllProducts();
	int addProduct(Product product);
}
