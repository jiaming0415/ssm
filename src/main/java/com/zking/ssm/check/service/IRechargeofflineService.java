package com.zking.ssm.check.service;

import com.zking.ssm.check.model.Rechargeoffline;

public interface IRechargeofflineService {
    int deleteByPrimaryKey(Integer id);

    int insert(Rechargeoffline record);

    int insertSelective(Rechargeoffline record);

    Rechargeoffline selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rechargeoffline record);

    int updateByPrimaryKey(Rechargeoffline record);
}