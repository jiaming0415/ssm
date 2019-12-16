package com.zking.ssm.systemaccount.mapper;

import com.zking.ssm.systemaccount.model.Userbankinfo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserbankinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Userbankinfo record);

    int insertSelective(Userbankinfo record);

    Userbankinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Userbankinfo record);

    int updateByPrimaryKey(Userbankinfo record);
}