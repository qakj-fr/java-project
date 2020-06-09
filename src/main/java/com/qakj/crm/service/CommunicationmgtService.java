package com.qakj.crm.service;

import java.util.List;

import com.qakj.crm.pojo.Communicationmgt;

public interface CommunicationmgtService {
	List<Communicationmgt> getCommunicationmgt(String searchName);
	void addCommunicationmgt(Communicationmgt c);
	void deleteCommunicationmgt(int id);
	Communicationmgt getCommunicationmgtById(int id);
	void updateCommunicationmgt(Communicationmgt c);
}
