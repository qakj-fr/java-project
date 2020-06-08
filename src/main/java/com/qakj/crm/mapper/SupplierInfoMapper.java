package com.qakj.crm.mapper;

import com.qakj.crm.pojo.SupplierInfo;
import com.qakj.crm.pojo.SupplierInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierInfoMapper {
	List<SupplierInfo> selectSupplierInfo(@Param("searchName") String searchName);
	
    int countByExample(SupplierInfoExample example);

    int deleteByExample(SupplierInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SupplierInfo record);

    int insertSelective(SupplierInfo record);

    List<SupplierInfo> selectByExample(SupplierInfoExample example);

    SupplierInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SupplierInfo record, @Param("example") SupplierInfoExample example);

    int updateByExample(@Param("record") SupplierInfo record, @Param("example") SupplierInfoExample example);

    int updateByPrimaryKeySelective(SupplierInfo record);

    int updateByPrimaryKey(SupplierInfo record);
}