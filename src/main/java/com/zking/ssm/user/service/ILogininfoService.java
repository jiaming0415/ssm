package com.zking.ssm.user.service;

import com.zking.ssm.user.model.Logininfo;

public interface ILogininfoService {
    int deleteByPrimaryKey(Long id);

    int insert(Logininfo record);

    int insertSelective(Logininfo record);

    Logininfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Logininfo record);

    int updateByPrimaryKey(Logininfo record);
}