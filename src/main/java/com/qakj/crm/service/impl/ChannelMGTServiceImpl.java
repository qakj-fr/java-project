package com.qakj.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qakj.crm.mapper.ChannelMGTMapper;
import com.qakj.crm.pojo.ChannelMGT;
import com.qakj.crm.pojo.ChannelMGTExample;
import com.qakj.crm.service.ChannelMGTService;
@Transactional
@Service
public class ChannelMGTServiceImpl implements ChannelMGTService{
	@Autowired
	private ChannelMGTMapper channelMGTMapper;

	@Override
	public List<ChannelMGT> getAllChannelMGT() {
		ChannelMGTExample example=new ChannelMGTExample();
		List<ChannelMGT> list = channelMGTMapper.selectByExample(example);
		return list;
	}
	
	
}
