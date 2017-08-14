package com.yiche.wq.core.dao;

import com.yiche.wq.common.domain.po.TCustInfo;
import com.yiche.wq.common.domain.po.TCustInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCustInfoMapper {
    int countByExample(TCustInfoExample example);

    int deleteByExample(TCustInfoExample example);

    int deleteByPrimaryKey(Integer custId);

    int insert(TCustInfo record);

    int insertSelective(TCustInfo record);

    List<TCustInfo> selectByExample(TCustInfoExample example);

    TCustInfo selectByPrimaryKey(Integer custId);

    int updateByExampleSelective(@Param("record") TCustInfo record, @Param("example") TCustInfoExample example);

    int updateByExample(@Param("record") TCustInfo record, @Param("example") TCustInfoExample example);

    int updateByPrimaryKeySelective(TCustInfo record);

    int updateByPrimaryKey(TCustInfo record);
}