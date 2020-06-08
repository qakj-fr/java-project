package com.qakj.crm.service;

import java.util.List;

import com.qakj.crm.pojo.SupplierInfo;

public interface SupplierInfoService {
	List<SupplierInfo> getSupplierInfo();
	void AddSupplierInfo(SupplierInfo sInfo);
	void deleteSupplierInfo(int id);
	SupplierInfo getSupplierInfoById(int id);
	void updateSupplierInfo(SupplierInfo sInfo);
	List<SupplierInfo> selectSupplierInfo(String searchName);
}
