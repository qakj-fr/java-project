package com.qakj.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qakj.crm.mapper.SupplierInfoMapper;
import com.qakj.crm.pojo.SupplierInfo;
import com.qakj.crm.pojo.SupplierInfoExample;
import com.qakj.crm.service.SupplierInfoService;
@Transactional
@Service
public class SupplierInfoServiceImpl implements SupplierInfoService{
	@Autowired
	private SupplierInfoMapper supplierInfoMapper;

	@Override
	public List<SupplierInfo> getSupplierInfo() {
		SupplierInfoExample example=new SupplierInfoExample();
		List<SupplierInfo> list = supplierInfoMapper.selectByExample(example);
		return list;
	}

	@Override
	public void AddSupplierInfo(SupplierInfo sInfo) {
		supplierInfoMapper.insertSelective(sInfo);
	}

	@Override
	public void deleteSupplierInfo(int id) {
		supplierInfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public SupplierInfo getSupplierInfoById(int id) {
		SupplierInfo supplierInfo = supplierInfoMapper.selectByPrimaryKey(id);
		return supplierInfo;
	}

	@Override
	public void updateSupplierInfo(SupplierInfo sInfo) {
		supplierInfoMapper.updateByPrimaryKey(sInfo);
	}

	@Override
	public List<SupplierInfo> selectSupplierInfo(String searchName) {
		List<SupplierInfo> list = supplierInfoMapper.selectSupplierInfo(searchName);
		return list;
	}
	
	
}
