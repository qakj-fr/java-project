package com.qakj.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qakj.crm.pojo.ChannelMGT;
import com.qakj.crm.service.ChannelMGTService;

@RequestMapping("/channelMGTController")
@RestController
public class ChannelMGTController {
	@Autowired
	private ChannelMGTService channelMGTService;
	@RequestMapping("/getAllChannelMGT")
	public Object getAllChannelMGT(){
		List<ChannelMGT> list = channelMGTService.getAllChannelMGT();
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("code", "200");
		map.put("data", list);
		return map;
	}
}








