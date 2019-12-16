package com.zking.ssm.system.service;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.system.model.Role;

import java.util.List;

public interface IRoleService {
    int deleteByPrimaryKey(String roleid);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(String roleid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    List<Role> selectListPager(Role record, PageBean pageBean);

}