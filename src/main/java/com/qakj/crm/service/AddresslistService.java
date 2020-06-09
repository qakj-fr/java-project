package com.qakj.crm.service;

import java.util.List;

import com.qakj.crm.pojo.Addresslist;

public interface AddresslistService {
	List<Addresslist> getAddresslists(String SearchName);
	void addAddresslist(Addresslist a);
	void deleteAddresslist(Integer id);
}
