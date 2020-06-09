package com.qakj.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qakj.crm.pojo.Customer;
import com.qakj.crm.pojo.Purchasemgts;
import com.qakj.crm.service.PurchasemgtService;
@RequestMapping("/purchasemgtController")
@RestController
public class PurchasemgtController {
	@Autowired
	private PurchasemgtService purchasemgtService;
	@RequestMapping("/getAllPurchasemgt")
	public Object getAllPurchaseMGT(@RequestParam("searchName") String searchName){
		if(searchName == null || "".equals(searchName)){
			searchName = "%%";
		}else{
			searchName = "%"+searchName+"%";
		}
		
		List<Purchasemgts> list = purchasemgtService.getAllPurchaseMGT(searchName);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code", "200");
		map.put("data", list);
		return map;
	}
	@RequestMapping("/updatePurchasemgt")
	public Object updatePurchasemgt(Purchasemgts p){
		purchasemgtService.updatePurchasemgts(p);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("code", "200");
		map.put("msg", "修改成功");
		return map;
	}
	@RequestMapping("getPurchasemgtsById")
	public Object getPurchasemgtsById(@RequestParam("id") Integer id){
		Purchasemgts purchasemgts = purchasemgtService.getPurchasemgtsById(id);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "200");
		map.put("data", purchasemgts);
		return map;	
	}
	@RequestMapping("deletePurchasemgt")
	public Object deletePurchasemgt(@RequestParam("id") Integer id){
		purchasemgtService.deletePurchasemgtsById(id);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "200");
		map.put("msg","退订成功");
		return map;
		
	}
	@RequestMapping("addPurchasemgt")
	public Object addPurchasemgt(Purchasemgts p){
		purchasemgtService.addPurchasemgts(p);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "200");
		map.put("msg","添加成功");
		return map;
	}
	
}












