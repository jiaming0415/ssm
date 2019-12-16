package com.zking.ssm.check.service.impl;

import com.zking.ssm.check.mapper.MailverifyMapper;
import com.zking.ssm.check.model.Mailverify;
import com.zking.ssm.check.service.IMailverifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailverifyServiceImpl implements IMailverifyService {
    @Autowired
    private MailverifyMapper mapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Mailverify record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Mailverify record) {
        return mapper.insert(record);
    }

    @Override
    public Mailverify selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Mailverify record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Mailverify record) {
        return mapper.updateByPrimaryKey(record);
    }
}
