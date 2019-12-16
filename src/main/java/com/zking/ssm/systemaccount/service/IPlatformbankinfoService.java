package com.zking.ssm.systemaccount.service;

import com.zking.ssm.systemaccount.model.Platformbankinfo;

public interface IPlatformbankinfoService {
    int deleteByPrimaryKey(Integer id);

    int insert(Platformbankinfo record);

    int insertSelective(Platformbankinfo record);

    Platformbankinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Platformbankinfo record);

    int updateByPrimaryKey(Platformbankinfo record);
}