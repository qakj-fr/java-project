package com.qakj.crm.service;

import java.util.List;

import com.qakj.crm.pojo.Schedulemgt;

public interface SchedulemgtService {
		List<Schedulemgt> findAll();
		void addSchedulemgt(Schedulemgt s);
}
