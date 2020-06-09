package com.qakj.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qakj.crm.pojo.Callmgt;
import com.qakj.crm.service.CallmgtService;
@RequestMapping("/CallmgtController")
@RestController
public class CallmgtController {
	@Autowired
	private CallmgtService cs;
	@RequestMapping("/getCallmgt")
	public Object getCallmgt(){
		List<Callmgt> list = cs.getCallmgt();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code", "200");
		map.put("data", list);
		return map;
	}
}
