package com.zking.ssm.systemaccount.service.impl;

import com.zking.ssm.systemaccount.mapper.UserbankinfoMapper;
import com.zking.ssm.systemaccount.model.Userbankinfo;
import com.zking.ssm.systemaccount.service.IUserbankinfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserbankinfoServiceImpl implements IUserbankinfoService {
    @Autowired
    private UserbankinfoMapper mapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Userbankinfo record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Userbankinfo record) {
        return mapper.insertSelective(record);
    }

    @Override
    public Userbankinfo selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Userbankinfo record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Userbankinfo record) {
        return mapper.updateByPrimaryKey(record);
    }
}
