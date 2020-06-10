package com.qakj.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qakj.crm.mapper.SchedulemgtMapper;
import com.qakj.crm.pojo.Schedulemgt;
import com.qakj.crm.pojo.SchedulemgtExample;
import com.qakj.crm.service.SchedulemgtService;
@Transactional
@Service
public class SchedulemgtServiceImpl implements SchedulemgtService{
	@Autowired
	private SchedulemgtMapper sm;
	@Override
	public List<Schedulemgt> findAll() {
		SchedulemgtExample example=new SchedulemgtExample();
		List<Schedulemgt> list = sm.selectByExample(example);
		return list;
	}
	@Override
	public void addSchedulemgt(Schedulemgt s) {
		sm.insert(s);
	}

}






