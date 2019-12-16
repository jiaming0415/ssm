package com.zking.ssm.system.service.impl;

import com.zking.ssm.system.mapper.RoleModuleMapper;
import com.zking.ssm.system.model.RoleModule;
import com.zking.ssm.system.service.IRoleModuleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleModuleServiceImpl implements IRoleModuleService {
    @Autowired
    private RoleModuleMapper mapper;
    @Override
    public int insert(RoleModule record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(RoleModule record) {
        return mapper.insert(record);
    }

    @Override
    public List<RoleModule> queryListByModuleidAndRoleid(RoleModule record) {
        return mapper.queryListByModuleidAndRoleid(record);
    }

    @Override
    public int deleteByModuleidAndRoleid(RoleModule record) {
        return mapper.deleteByModuleidAndRoleid(record);
    }
}
