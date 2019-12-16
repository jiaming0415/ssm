package com.zking.ssm.check.service.impl;

import com.zking.ssm.check.mapper.EmailverifyMapper;
import com.zking.ssm.check.model.Emailverify;
import com.zking.ssm.check.service.IEmailverifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailverifyServiceImpl implements IEmailverifyService {
    @Autowired
    private EmailverifyMapper mapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Emailverify record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Emailverify record) {
        return mapper.insertSelective(record);
    }

    @Override
    public Emailverify selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Emailverify record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Emailverify record) {
        return mapper.updateByPrimaryKey(record);
    }
}
