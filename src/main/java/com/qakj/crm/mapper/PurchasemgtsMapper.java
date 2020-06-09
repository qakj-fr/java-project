package com.qakj.crm.mapper;

import com.qakj.crm.pojo.Purchasemgts;
import com.qakj.crm.pojo.PurchasemgtsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchasemgtsMapper {
	List<Purchasemgts> selectPurchasemgts(@Param("searchName") String searchName);
	
    int countByExample(PurchasemgtsExample example);

    int deleteByExample(PurchasemgtsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Purchasemgts record);

    int insertSelective(Purchasemgts record);

    List<Purchasemgts> selectByExample(PurchasemgtsExample example);

    Purchasemgts selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Purchasemgts record, @Param("example") PurchasemgtsExample example);

    int updateByExample(@Param("record") Purchasemgts record, @Param("example") PurchasemgtsExample example);

    int updateByPrimaryKeySelective(Purchasemgts record);

    int updateByPrimaryKey(Purchasemgts record);
}