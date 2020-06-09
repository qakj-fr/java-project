package com.qakj.crm.service;

import java.util.List;

import com.qakj.crm.pojo.CheckCenter;

public interface CheckCenterService {
		List<CheckCenter> getCheckCenterAndSupplierInfo(String searchName);
		void addCheckCenter(CheckCenter c);
		void deleteCheckCenter(int id);
		List<CheckCenter> getAllCheckCenter();
}
