package com.zking.ssm.systemaccount.service.impl;

import com.zking.ssm.systemaccount.mapper.SystemaccountflowMapper;
import com.zking.ssm.systemaccount.model.Systemaccountflow;
import com.zking.ssm.systemaccount.service.ISystemaccountflowService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemaccountflowServiceImpl implements ISystemaccountflowService {
    @Autowired
    private SystemaccountflowMapper mapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Systemaccountflow record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Systemaccountflow record) {
        return mapper.insertSelective(record);
    }

    @Override
    public Systemaccountflow selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Systemaccountflow record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Systemaccountflow record) {
        return mapper.updateByPrimaryKey(record);
    }
}
