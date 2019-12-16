package com.zking.ssm.user.service.impl;

import com.zking.ssm.user.mapper.IplogMapper;
import com.zking.ssm.user.model.Iplog;
import com.zking.ssm.user.service.IIplogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IplogServiceImpl implements IIplogService {
    @Autowired
    private IplogMapper mapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Iplog record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Iplog record) {
        return mapper.insertSelective(record);
    }

    @Override
    public Iplog selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Iplog record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Iplog record) {
        return mapper.updateByPrimaryKey(record);
    }
}
