package com.zking.ssm.system.service.impl;

import com.zking.ssm.system.mapper.UserRoleMapper;
import com.zking.ssm.system.model.UserRole;
import com.zking.ssm.system.service.IUserRoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements IUserRoleService {
    @Autowired
    private UserRoleMapper mapper;
    @Override
    public int insert(UserRole record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(UserRole record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<UserRole> queryListByUseridAndRoleid(UserRole record) {
        return mapper.queryListByUseridAndRoleid(record);
    }

    @Override
    public int deleteByUseridAndRoleid(UserRole record) {
        return mapper.deleteByUseridAndRoleid(record);
    }
}
