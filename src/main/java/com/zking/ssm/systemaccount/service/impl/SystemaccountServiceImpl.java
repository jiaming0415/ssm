package com.zking.ssm.systemaccount.service.impl;

import com.zking.ssm.systemaccount.mapper.SystemaccountMapper;
import com.zking.ssm.systemaccount.model.Systemaccount;
import com.zking.ssm.systemaccount.service.ISystemaccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemaccountServiceImpl implements ISystemaccountService {
    @Autowired
    private SystemaccountMapper mapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Systemaccount record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Systemaccount record) {
        return mapper.insertSelective(record);
    }

    @Override
    public Systemaccount selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Systemaccount record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Systemaccount record) {
        return mapper.updateByPrimaryKey(record);
    }
}
