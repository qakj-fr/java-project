package com.qakj.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qakj.crm.pojo.SupplierInfo;
import com.qakj.crm.service.SupplierInfoService;
@RequestMapping("/supplierInfoController")
@RestController
public class SupplierInfoController {
	@Autowired
	private SupplierInfoService supplierInfoService;
	
	@RequestMapping("/getSupplierInfo")
	public Object getSupplierInfo(){
		List<SupplierInfo> list = supplierInfoService.getSupplierInfo();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code", "200");
		map.put("data", list);
		return map;
	}
	
	@RequestMapping("/addSupplierInfo")
	public Object addSupplierInfo(SupplierInfo sInfo){
		supplierInfoService.AddSupplierInfo(sInfo);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code", "200");
		map.put("msg", "添加成功");
		return map;
	}
	
	@RequestMapping("/deleteSupplierInfo")
	public Object deleteSupplierInfo(@RequestParam("id") Integer id){
		supplierInfoService.deleteSupplierInfo(id);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code", "200");
		map.put("msg", "删除成功");
		return map;
	}
	
	@RequestMapping("/getSupplierInfoById")
	public Object getSupplierInfoById(@RequestParam("id") Integer id){
		SupplierInfo supplierInfo = supplierInfoService.getSupplierInfoById(id);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code", "200");
		map.put("data", supplierInfo);
		return map;
	}
	
	@RequestMapping("/updateSupplierInfo")
	public Object updateSupplierInfo(SupplierInfo sInfo){
		supplierInfoService.updateSupplierInfo(sInfo);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code", "200");
		map.put("msg", "修改成功");
		return map;
	}
	
	@RequestMapping("/selectSupplierInfo")
	public Object selectSupplierInfo(@RequestParam("searchName") String searchName){
		if(searchName==null || "".equals(searchName)){
			searchName="%%";
		}else{
			searchName="%"+searchName+"%";
		}
		List<SupplierInfo> list = supplierInfoService.selectSupplierInfo(searchName);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("code", "200");
		map.put("data", list);
		return map;
	}
}










