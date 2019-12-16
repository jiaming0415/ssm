package com.zking.ssm.check.service.impl;

import com.zking.ssm.check.mapper.BidrequestMapper;
import com.zking.ssm.check.model.Bidrequest;
import com.zking.ssm.check.service.IBidrequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidrequestServiceImpl implements IBidrequestService {
    @Autowired
    private BidrequestMapper mapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Bidrequest record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Bidrequest record) {
        return mapper.insertSelective(record);
    }

    @Override
    public Bidrequest selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Bidrequest record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Bidrequest record) {
        return mapper.updateByPrimaryKey(record);
    }
}
