package com.qakj.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qakj.crm.pojo.CheckCenter;
import com.qakj.crm.service.CheckCenterService;
@RequestMapping("/checkCenterController")
@RestController
public class CheckCenterController {
		@Autowired
		private CheckCenterService cs;
		@RequestMapping("/findAll")
		public Object findAll(@RequestParam("searchName") String searchName){
			if(searchName ==null || "".equals(searchName)){
				searchName="%%";
			}else{
				searchName="%"+searchName+"%";
			}
			List<CheckCenter> list = cs.getCheckCenterAndSupplierInfo(searchName);
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("code", "200");
			map.put("data",list);
			return map;
		}
		
		@RequestMapping("/getAllCheckCenter")
		public Object getAllCheckCenter(){
			List<CheckCenter> list = cs.getAllCheckCenter();
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("code", "200");
			map.put("data", list);
			return map;
		}
		
		@RequestMapping("/addCheckCenter")
		public Object addCheckCenter(CheckCenter c){
			cs.addCheckCenter(c);
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("code", "200");
			map.put("msg","添加成功");
			return map;
		}
		@RequestMapping("/delete")
		public Object delete(@RequestParam("id") Integer id){
			cs.deleteCheckCenter(id);
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("code", "200");
			map.put("msg","删除成功");
			return map;
		}
}
