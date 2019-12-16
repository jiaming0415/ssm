package com.zking.ssm.systemaccount.mapper;

import com.zking.ssm.systemaccount.model.Platformbankinfo;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatformbankinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Platformbankinfo record);

    int insertSelective(Platformbankinfo record);

    Platformbankinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Platformbankinfo record);

    int updateByPrimaryKey(Platformbankinfo record);
}