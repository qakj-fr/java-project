package com.qakj.crm.service;

import java.util.List;


import com.qakj.crm.pojo.Purchasemgts;

public interface PurchasemgtService {
		List<Purchasemgts> getAllPurchaseMGT(String searchName);
		void updatePurchasemgts(Purchasemgts p);
		Purchasemgts getPurchasemgtsById(int id);
		void deletePurchasemgtsById(int id);
		void addPurchasemgts(Purchasemgts p);
		
}
