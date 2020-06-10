package com.qakj.crm.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.qakj.crm.pojo.Product;
import com.qakj.crm.service.ProductService;
import com.qakj.crm.utils.UUIDUtils;
@RequestMapping("/productController")
@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	@RequestMapping("/getAllProducts")
	public Object getAllProducts(){
		List<Product> list = productService.getAllProducts();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code","200");
		map.put("data", list);
		return map;
	}
	
	@RequestMapping("/addProduct")
	public Object addProduct(@RequestParam("productName") String name,@RequestParam("productPrice") Integer price,@RequestParam("img") MultipartFile file) throws Exception{
		System.out.println(name+"--"+price+"--"+file.getOriginalFilename());
		String filename=UUIDUtils.getUUID()+file.getOriginalFilename();
		file.transferTo(new File("c:/uploads/"+filename));
		Product product=new Product();
		product.setName(name);
		product.setPrice(price);
		product.setImg("http://localhost:8082/crm/img/"+filename);
		int i = productService.addProduct(product);
		Map<String,Object> map=new HashMap<String,Object>();
		if(i>0){
			map.put("code", "200");
			map.put("msg", "添加成功");
			return map;
		}
		map.put("code", "200");
		map.put("msg", "添加失败");
		return map;
	}
}










