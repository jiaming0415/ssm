package com.zking.ssm.system.service;

import com.zking.ssm.system.model.UserRole;

import java.util.List;

public interface IUserRoleService {
    int insert(UserRole record);

    int insertSelective(UserRole record);

    List<UserRole> queryListByUseridAndRoleid(UserRole record);

    int deleteByUseridAndRoleid(UserRole record);

}