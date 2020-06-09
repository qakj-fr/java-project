package com.qakj.crm.mapper;

import com.qakj.crm.pojo.ChannelMGT;
import com.qakj.crm.pojo.ChannelMGTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChannelMGTMapper {
    int countByExample(ChannelMGTExample example);

    int deleteByExample(ChannelMGTExample example);

    int insert(ChannelMGT record);

    int insertSelective(ChannelMGT record);

    List<ChannelMGT> selectByExample(ChannelMGTExample example);

    int updateByExampleSelective(@Param("record") ChannelMGT record, @Param("example") ChannelMGTExample example);

    int updateByExample(@Param("record") ChannelMGT record, @Param("example") ChannelMGTExample example);
}