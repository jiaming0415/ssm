package com.zking.ssm.user.service.impl;

import com.zking.ssm.user.mapper.LogininfoMapper;
import com.zking.ssm.user.model.Logininfo;
import com.zking.ssm.user.service.ILogininfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogininfoServiceImpl implements ILogininfoService {
    @Autowired
    private LogininfoMapper mapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Logininfo record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Logininfo record) {
        return mapper.insertSelective(record);
    }

    @Override
    public Logininfo selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Logininfo record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Logininfo record) {
        return mapper.updateByPrimaryKey(record);
    }
}
