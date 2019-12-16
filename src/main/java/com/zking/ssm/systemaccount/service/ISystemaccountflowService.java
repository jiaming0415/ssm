package com.zking.ssm.systemaccount.service;

import com.zking.ssm.systemaccount.model.Systemaccountflow;

public interface ISystemaccountflowService {
    int deleteByPrimaryKey(Integer id);

    int insert(Systemaccountflow record);

    int insertSelective(Systemaccountflow record);

    Systemaccountflow selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Systemaccountflow record);

    int updateByPrimaryKey(Systemaccountflow record);
}