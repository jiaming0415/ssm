package com.zking.ssm.user.service;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.user.model.Userinfo;

import java.util.List;

public interface IUserinfoService {
    int deleteByPrimaryKey(String id);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);

    List<Userinfo> selectListPager(Userinfo record, PageBean pageBean);

    int register(Userinfo user);

    Userinfo login (Userinfo userinfo);

}