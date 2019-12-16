package com.zking.ssm.check.service.impl;

import com.zking.ssm.check.mapper.RechargeofflineMapper;
import com.zking.ssm.check.model.Rechargeoffline;
import com.zking.ssm.check.service.IRechargeofflineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RechargeofflineServiceImpl implements IRechargeofflineService {
    @Autowired
    private RechargeofflineMapper mapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Rechargeoffline record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Rechargeoffline record) {
        return mapper.insertSelective(record);
    }

    @Override
    public Rechargeoffline selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Rechargeoffline record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Rechargeoffline record) {
        return mapper.updateByPrimaryKey(record);
    }
}
