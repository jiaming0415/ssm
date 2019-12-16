package com.zking.ssm.systemaccount.service;

import com.zking.ssm.systemaccount.model.Userbankinfo;

public interface IUserbankinfoService {
    int deleteByPrimaryKey(Long id);

    int insert(Userbankinfo record);

    int insertSelective(Userbankinfo record);

    Userbankinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Userbankinfo record);

    int updateByPrimaryKey(Userbankinfo record);
}