package com.qakj.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qakj.crm.pojo.Addresslist;
import com.qakj.crm.service.AddresslistService;
@RequestMapping("/AddresslistController")
@RestController
public class AddresslistController {
	@Autowired
	private AddresslistService as;
	@RequestMapping("/getAll")
	public Object getAll(@RequestParam("searchName") String searchName){
		if(searchName==null || "".equals(searchName)){
			searchName="%%";
		}else{
			searchName="%"+searchName+"%";
		}
		List<Addresslist> list = as.getAddresslists(searchName);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code", "200");
		map.put("data", list);
		return map;
	}
	@RequestMapping("/addAddresslist")
	public Object addAddresslist(Addresslist a){
		as.addAddresslist(a);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code", "200");
		map.put("msg", "添加成功");
		return map;
	}
	@RequestMapping("/deleteAddresslist")
	public Object deleteAddresslist(@RequestParam("id") Integer id){
		as.deleteAddresslist(id);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code", "200");
		map.put("msg", "删除成功");
		return map;
	}
}







