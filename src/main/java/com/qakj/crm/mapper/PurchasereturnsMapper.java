package com.qakj.crm.mapper;

import com.qakj.crm.pojo.Purchasereturns;
import com.qakj.crm.pojo.PurchasereturnsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchasereturnsMapper {
    int countByExample(PurchasereturnsExample example);

    int deleteByExample(PurchasereturnsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Purchasereturns record);

    int insertSelective(Purchasereturns record);

    List<Purchasereturns> selectByExample(PurchasereturnsExample example);

    Purchasereturns selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Purchasereturns record, @Param("example") PurchasereturnsExample example);

    int updateByExample(@Param("record") Purchasereturns record, @Param("example") PurchasereturnsExample example);

    int updateByPrimaryKeySelective(Purchasereturns record);

    int updateByPrimaryKey(Purchasereturns record);
}