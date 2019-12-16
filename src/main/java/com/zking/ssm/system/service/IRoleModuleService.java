package com.zking.ssm.system.service;

import com.zking.ssm.system.model.RoleModule;

import java.util.List;

public interface IRoleModuleService {
    int insert(RoleModule record);

    int insertSelective(RoleModule record);


    List<RoleModule> queryListByModuleidAndRoleid(RoleModule record);

    int deleteByModuleidAndRoleid(RoleModule record);
}