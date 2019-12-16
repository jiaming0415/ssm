package com.zking.ssm.system.service.impl;

import com.zking.ssm.system.mapper.ModuleInfoMapper;
import com.zking.ssm.system.model.ModuleInfo;
import com.zking.ssm.system.service.IModuleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleInfoServiceImpl implements IModuleInfoService {
    @Autowired
    private ModuleInfoMapper mapper;
    @Override
    public int deleteByPrimaryKey(String id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ModuleInfo record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(ModuleInfo record) {
        return mapper.insertSelective(record);
    }

    @Override
    public ModuleInfo selectByPrimaryKey(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ModuleInfo record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ModuleInfo record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
   public List<ModuleInfo> queryModuleInfoByPid(String pid) {
        return mapper.queryModuleInfoByPid(pid);
    }
}
