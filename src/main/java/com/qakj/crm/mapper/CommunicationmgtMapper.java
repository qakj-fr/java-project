package com.qakj.crm.mapper;

import com.qakj.crm.pojo.Communicationmgt;
import com.qakj.crm.pojo.CommunicationmgtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommunicationmgtMapper {
	List<Communicationmgt> selectCommunicationmgt(@Param("searchName") String searchName);
	
    int countByExample(CommunicationmgtExample example);

    int deleteByExample(CommunicationmgtExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Communicationmgt record);

    int insertSelective(Communicationmgt record);

    List<Communicationmgt> selectByExample(CommunicationmgtExample example);

    Communicationmgt selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Communicationmgt record, @Param("example") CommunicationmgtExample example);

    int updateByExample(@Param("record") Communicationmgt record, @Param("example") CommunicationmgtExample example);

    int updateByPrimaryKeySelective(Communicationmgt record);

    int updateByPrimaryKey(Communicationmgt record);
}