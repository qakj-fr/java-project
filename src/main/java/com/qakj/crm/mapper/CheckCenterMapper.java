package com.qakj.crm.mapper;

import com.qakj.crm.pojo.CheckCenter;
import com.qakj.crm.pojo.CheckCenterExample;
import com.qakj.crm.pojo.SupplierInfo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckCenterMapper {
	List<CheckCenter> selectAll();
	
	List<CheckCenter> getCheckCenterAndSupplierInfo(@Param("searchName") String searchName);
	
    int countByExample(CheckCenterExample example);

    int deleteByExample(CheckCenterExample example);
    
    int deleteByPrimaryKey(Integer id);

    int insert(CheckCenter record);

    int insertSelective(CheckCenter record);

    List<CheckCenter> selectByExample(CheckCenterExample example);

    int updateByExampleSelective(@Param("record") CheckCenter record, @Param("example") CheckCenterExample example);

    int updateByExample(@Param("record") CheckCenter record, @Param("example") CheckCenterExample example);
    
    int updateByPrimaryKeySelective(CheckCenter record);

    int updateByPrimaryKey(CheckCenter record);
}