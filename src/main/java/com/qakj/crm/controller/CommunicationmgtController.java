package com.qakj.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qakj.crm.pojo.Communicationmgt;
import com.qakj.crm.service.CommunicationmgtService;
@RequestMapping("/communicationmgtController")
@RestController
public class CommunicationmgtController {
	@Autowired
	private CommunicationmgtService cs;
	
	@RequestMapping("/findAll")
	public Object findAll(@RequestParam("searchName") String searchName){
		if(searchName==null || "".equals(searchName)){
			searchName="%%";
		}else{
			searchName="%"+searchName+"%";
		}
		List<Communicationmgt> list = cs.getCommunicationmgt(searchName);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code", "200");
		map.put("data", list);
		return map;
	}
	@RequestMapping("/addCommunicationmgt")
	public Object addCommunicationmgt(Communicationmgt c){
		cs.addCommunicationmgt(c);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code", "200");
		map.put("msg", "添加成功");
		return map;
	}
	@RequestMapping("/delete")
	public Object delete(@RequestParam("id") Integer id){
		cs.deleteCommunicationmgt(id);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code", "200");
		map.put("msg", "删除成功");
		return map;
	}
	@RequestMapping("/getCommunicationmgtById")
	public Object getCommunicationmgtById(@RequestParam("id") Integer id){
		Communicationmgt communicationmgtById = cs.getCommunicationmgtById(id);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code", "200");
		map.put("data", communicationmgtById);
		return map;
	}
	@RequestMapping("/updateCommunicationmgt")
	public Object updateCommunicationmgt(Communicationmgt c){
		cs.updateCommunicationmgt(c);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code", "200");
		map.put("msg", "修改成功");
		return map;
	}
}
