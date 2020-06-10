package com.qakj.crm.mapper;

import com.qakj.crm.pojo.Schedulemgt;
import com.qakj.crm.pojo.SchedulemgtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchedulemgtMapper {
    int countByExample(SchedulemgtExample example);

    int deleteByExample(SchedulemgtExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Schedulemgt record);

    int insertSelective(Schedulemgt record);

    List<Schedulemgt> selectByExample(SchedulemgtExample example);

    Schedulemgt selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Schedulemgt record, @Param("example") SchedulemgtExample example);

    int updateByExample(@Param("record") Schedulemgt record, @Param("example") SchedulemgtExample example);

    int updateByPrimaryKeySelective(Schedulemgt record);

    int updateByPrimaryKey(Schedulemgt record);
}