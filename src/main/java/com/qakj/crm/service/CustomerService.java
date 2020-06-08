package com.qakj.crm.service;

import java.util.List;

import com.qakj.crm.pojo.Customer;

public interface CustomerService {
	List<Customer> getCustomers(int currentPage,int pageSize,String searchName);
	int getCustomerCount(String searchName);
	Customer getCustomerById(int id);
	void deleteCustomerById(int id);
	void addCustomer(Customer c);
	void updateCustomer(Customer c);
}
