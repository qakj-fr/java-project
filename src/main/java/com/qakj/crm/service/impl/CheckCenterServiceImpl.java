package com.qakj.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qakj.crm.mapper.CheckCenterMapper;
import com.qakj.crm.pojo.CheckCenter;
import com.qakj.crm.pojo.CheckCenterExample;
import com.qakj.crm.pojo.CheckCenterExample.Criteria;
import com.qakj.crm.service.CheckCenterService;
@Transactional
@Service
public class CheckCenterServiceImpl implements CheckCenterService{
	@Autowired
	private CheckCenterMapper cm;
	@Override
	public List<CheckCenter> getCheckCenterAndSupplierInfo(String searchName) {
		CheckCenterExample example=new CheckCenterExample();
		Criteria criteria = example.createCriteria();
		criteria.andCommoditynameLike(searchName);
		List<CheckCenter> list = cm.selectByExample(example);
		return list;
	}
	@Override
	public void addCheckCenter(CheckCenter c) {
		cm.insertSelective(c);
	}
	@Override
	public void deleteCheckCenter(int id) {
		cm.deleteByPrimaryKey(id);
	}
	@Override
	public List<CheckCenter> getAllCheckCenter() {
		List<CheckCenter> list = cm.selectAll();
		return list;
	};
}	








