package com.qakj.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qakj.crm.pojo.Schedulemgt;
import com.qakj.crm.service.SchedulemgtService;
@RequestMapping("/schedulemgtController")
@RestController
public class SchedulemgtController {
	@Autowired
	private SchedulemgtService ss;
	@RequestMapping("/findAll")
	public Object findAll(){
		List<Schedulemgt> list = ss.findAll();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code", "200");
		map.put("data", list);
		return map;
	}
	@RequestMapping("/addSchedulemgt")
	public Object addSchedulemgt(Schedulemgt s){
		ss.addSchedulemgt(s);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code", "200");
		map.put("msg", "添加成功");
		return map;
	}
}
