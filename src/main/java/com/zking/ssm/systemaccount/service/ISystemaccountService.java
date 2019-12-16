package com.zking.ssm.systemaccount.service;

import com.zking.ssm.systemaccount.model.Systemaccount;

public interface ISystemaccountService {
    int deleteByPrimaryKey(Integer id);

    int insert(Systemaccount record);

    int insertSelective(Systemaccount record);

    Systemaccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Systemaccount record);

    int updateByPrimaryKey(Systemaccount record);
}