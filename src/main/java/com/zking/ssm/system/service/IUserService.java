package com.zking.ssm.system.service;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.system.model.Module;
import com.zking.ssm.system.model.User;

import java.util.List;

public interface IUserService {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectListPager(User record, PageBean pageBean);

    User userlogin(User record);

    List<Module> selectModuleByUserid(User record);

}