package com.qakj.crm.mapper;

import com.qakj.crm.pojo.Addresslist;
import com.qakj.crm.pojo.AddresslistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddresslistMapper {
	
	List<Addresslist> getAddresslists(@Param("searchName") String searchName);
	
    int countByExample(AddresslistExample example);

    int deleteByExample(AddresslistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Addresslist record);

    int insertSelective(Addresslist record);

    List<Addresslist> selectByExample(AddresslistExample example);

    Addresslist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Addresslist record, @Param("example") AddresslistExample example);

    int updateByExample(@Param("record") Addresslist record, @Param("example") AddresslistExample example);

    int updateByPrimaryKeySelective(Addresslist record);

    int updateByPrimaryKey(Addresslist record);
}