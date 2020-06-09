package com.qakj.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qakj.crm.mapper.CommunicationmgtMapper;
import com.qakj.crm.pojo.Communicationmgt;
import com.qakj.crm.pojo.CommunicationmgtExample;
import com.qakj.crm.pojo.CommunicationmgtExample.Criteria;
import com.qakj.crm.service.CommunicationmgtService;
@Transactional
@Service
public class CommunicationmgtServiceImpl implements CommunicationmgtService{
	@Autowired
	private CommunicationmgtMapper cm;

	@Override
	public List<Communicationmgt> getCommunicationmgt(String searchName) {
		CommunicationmgtExample example=new CommunicationmgtExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameLike(searchName);
		List<Communicationmgt> list = cm.selectByExample(example);
		return list;
	}
	@Override
	public void addCommunicationmgt(Communicationmgt c) {
		cm.insertSelective(c);
	}

	@Override
	public void deleteCommunicationmgt(int id) {
		cm.deleteByPrimaryKey(id);
	}

	@Override
	public Communicationmgt getCommunicationmgtById(int id) {
		Communicationmgt key = cm.selectByPrimaryKey(id);
		return key;
	}

	@Override
	public void updateCommunicationmgt(Communicationmgt c) {
		cm.updateByPrimaryKey(c);
	}

	
	

}
