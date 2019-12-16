package com.zking.ssm.system.service.impl;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.system.mapper.RoleMapper;
import com.zking.ssm.system.model.Role;
import com.zking.ssm.system.service.IRoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private RoleMapper mapper;
    @Override
    public int deleteByPrimaryKey(String roleid) {
        return mapper.deleteByPrimaryKey(roleid);
    }

    @Override
    public int insert(Role record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Role record) {
        return mapper.insertSelective(record);
    }

    @Override
    public Role selectByPrimaryKey(String roleid) {
        return mapper.selectByPrimaryKey(roleid);
    }

    @Override
    public int updateByPrimaryKeySelective(Role record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Role record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Role> selectListPager(Role record, PageBean pageBean) {
        return mapper.selectListPager(record);
    }
}
