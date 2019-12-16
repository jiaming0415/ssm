package com.zking.ssm.system.service.impl;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.system.mapper.UserMapper;
import com.zking.ssm.system.model.Module;
import com.zking.ssm.system.model.User;
import com.zking.ssm.system.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper mapper;
    @Override
    public int deleteByPrimaryKey(String id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return mapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public List<User> selectListPager(User record, PageBean pageBean) {
        return mapper.selectListPager(record);
    }

    @Override
    public User userlogin(User record) {
        return mapper.userlogin(record);
    }

    @Override
    public List<Module> selectModuleByUserid(User record) {
        return mapper.selectModuleByUserid(record);
    }
}
