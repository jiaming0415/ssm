package com.zking.ssm.system.service;

import com.zking.ssm.system.model.ModuleInfo;

import java.util.List;

public interface IModuleInfoService {
    int deleteByPrimaryKey(String id);

    int insert(ModuleInfo record);

    int insertSelective(ModuleInfo record);

    ModuleInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ModuleInfo record);

    int updateByPrimaryKey(ModuleInfo record);

    List<ModuleInfo> queryModuleInfoByPid(String pid);
}