package com.qakj.crm.mapper;

import com.qakj.crm.pojo.CheckCenter;
import com.qakj.crm.pojo.CheckCenterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckCenterMapper {
    int countByExample(CheckCenterExample example);

    int deleteByExample(CheckCenterExample example);

    int insert(CheckCenter record);

    int insertSelective(CheckCenter record);

    List<CheckCenter> selectByExample(CheckCenterExample example);

    int updateByExampleSelective(@Param("record") CheckCenter record, @Param("example") CheckCenterExample example);

    int updateByExample(@Param("record") CheckCenter record, @Param("example") CheckCenterExample example);
}