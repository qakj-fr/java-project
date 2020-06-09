package com.qakj.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qakj.crm.mapper.CallmgtMapper;
import com.qakj.crm.pojo.Callmgt;
import com.qakj.crm.pojo.CallmgtExample;
import com.qakj.crm.service.CallmgtService;
@Transactional
@Service
public class CallmgtServiceImpl implements CallmgtService{
	@Autowired
	private CallmgtMapper cm;
	@Override
	public List<Callmgt> getCallmgt() {
		CallmgtExample example=new CallmgtExample();
		List<Callmgt> list = cm.selectByExample(example);
		return list;
	}

}
