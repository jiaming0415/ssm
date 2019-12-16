package com.zking.ssm.user.service.impl;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.user.mapper.UserinfoMapper;
import com.zking.ssm.user.model.Userinfo;
import com.zking.ssm.user.service.IUserinfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserinfoServiceImpl implements IUserinfoService {
    @Autowired
    private UserinfoMapper mapper;
    @Override
    public int deleteByPrimaryKey(String id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Userinfo record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Userinfo record) {
        return mapper.insertSelective(record);
    }

    @Override
    public Userinfo selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Userinfo record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Userinfo record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Userinfo> selectListPager(Userinfo record, PageBean pageBean) {
        return mapper.selectListPager(record);
    }
    @Override
    public int register(Userinfo user) {
        return mapper.register(user);
    }

    @Override
    public Userinfo login(Userinfo userinfo) {
        return mapper.login(userinfo);
    }
}
