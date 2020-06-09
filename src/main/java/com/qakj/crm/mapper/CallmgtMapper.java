package com.qakj.crm.mapper;

import com.qakj.crm.pojo.Callmgt;
import com.qakj.crm.pojo.CallmgtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CallmgtMapper {
    int countByExample(CallmgtExample example);

    int deleteByExample(CallmgtExample example);

    int insert(Callmgt record);

    int insertSelective(Callmgt record);

    List<Callmgt> selectByExample(CallmgtExample example);

    int updateByExampleSelective(@Param("record") Callmgt record, @Param("example") CallmgtExample example);

    int updateByExample(@Param("record") Callmgt record, @Param("example") CallmgtExample example);
}