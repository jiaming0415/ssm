package com.zking.ssm.systemaccount.service.impl;

import com.zking.ssm.systemaccount.mapper.PlatformbankinfoMapper;
import com.zking.ssm.systemaccount.model.Platformbankinfo;
import com.zking.ssm.systemaccount.service.IPlatformbankinfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlatformbankinfoServiceImpl implements IPlatformbankinfoService {
    @Autowired
    private PlatformbankinfoMapper mapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Platformbankinfo record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Platformbankinfo record) {
        return mapper.insertSelective(record);
    }

    @Override
    public Platformbankinfo selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Platformbankinfo record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Platformbankinfo record) {
        return mapper.updateByPrimaryKey(record);
    }
}
