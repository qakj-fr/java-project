package com.qakj.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qakj.crm.mapper.AddresslistMapper;
import com.qakj.crm.pojo.Addresslist;
import com.qakj.crm.pojo.AddresslistExample;
import com.qakj.crm.pojo.AddresslistExample.Criteria;
import com.qakj.crm.service.AddresslistService;
@Transactional
@Service
public class AddresslistServiceImpl implements AddresslistService{
	@Autowired
	private AddresslistMapper am;
	@Override
	public List<Addresslist> getAddresslists(String searchName) {
		AddresslistExample example=new AddresslistExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameLike(searchName);
		List<Addresslist> addresslists = am.selectByExample(example);
		return addresslists;
	}
	@Override
	public void addAddresslist(Addresslist a) {
		am.insertSelective(a);
	}
	@Override
	public void deleteAddresslist(Integer id) {
		am.deleteByPrimaryKey(id);
	}

}
