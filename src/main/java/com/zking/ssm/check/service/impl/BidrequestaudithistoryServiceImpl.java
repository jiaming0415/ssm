package com.zking.ssm.check.service.impl;

import com.zking.ssm.check.mapper.BidrequestaudithistoryMapper;
import com.zking.ssm.check.model.Bidrequestaudithistory;
import com.zking.ssm.check.service.IBidrequestaudithistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidrequestaudithistoryServiceImpl implements IBidrequestaudithistoryService {
    @Autowired
    private BidrequestaudithistoryMapper mapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Bidrequestaudithistory record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Bidrequestaudithistory record) {
        return mapper.insertSelective(record);
    }

    @Override
    public Bidrequestaudithistory selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Bidrequestaudithistory record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Bidrequestaudithistory record) {
        return mapper.updateByPrimaryKey(record);
    }
}
