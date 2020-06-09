package com.qakj.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qakj.crm.mapper.PurchasemgtsMapper;
import com.qakj.crm.pojo.Purchasemgts;
import com.qakj.crm.pojo.PurchasemgtsExample;
import com.qakj.crm.pojo.PurchasemgtsExample.Criteria;
import com.qakj.crm.service.PurchasemgtService;
@Service
public class PurchasemgtServiceImpl implements PurchasemgtService{
	@Autowired
	private PurchasemgtsMapper purchasemgtsMapper;
	
	@Override
	public List<Purchasemgts> getAllPurchaseMGT(String searchName) {
		PurchasemgtsExample example=new PurchasemgtsExample();
		Criteria criteria = example.createCriteria();
		criteria.andManagerLike(searchName);
		List<Purchasemgts> list = purchasemgtsMapper.selectByExample(example);
		return list;
	}

	@Override
	public void updatePurchasemgts(Purchasemgts p) {
		purchasemgtsMapper.updateByPrimaryKeySelective(p);

	}

	@Override
	public Purchasemgts getPurchasemgtsById(int id) {
		Purchasemgts purchasemgts = purchasemgtsMapper.selectByPrimaryKey(id);
		return purchasemgts;
	}

	@Override
	public void deletePurchasemgtsById(int id) {
			purchasemgtsMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void addPurchasemgts(Purchasemgts p) {
		   purchasemgtsMapper.insertSelective(p);
	}	
}










