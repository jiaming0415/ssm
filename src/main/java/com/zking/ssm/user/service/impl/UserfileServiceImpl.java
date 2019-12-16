package com.zking.ssm.user.service.impl;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.user.mapper.UserfileMapper;
import com.zking.ssm.user.model.Userfile;
import com.zking.ssm.user.model.Userinfo;
import com.zking.ssm.user.service.IUserfileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserfileServiceImpl implements IUserfileService {
    @Autowired
    private UserfileMapper mapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Userfile record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Userfile record) {
        return mapper.insertSelective(record);
    }

    @Override
    public Userfile selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Userfile record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Userfile record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Userfile> selectOne(Long applierId) {
        return mapper.selectOne(applierId);
    }

    @Override
    public List<Map> selectPager(Userfile record, PageBean pageBean) {
        return mapper.selectAll(record);
    }


}