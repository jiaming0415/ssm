package com.zking.ssm.system.service.impl;

import com.zking.ssm.system.mapper.ModuleMapper;
import com.zking.ssm.system.model.Module;
import com.zking.ssm.system.service.IModuleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleServiceImpl implements IModuleService {
    @Autowired
    private ModuleMapper mapper;
    @Override
    public int deleteByPrimaryKey(String id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Module record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Module record) {
        return mapper.insertSelective(record);
    }

    @Override
    public Module selectByPrimaryKey(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Module record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Module record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Module> selectByPid(String pid) {
        List<Module> modules = mapper.selectByPid(pid);
        for (Module module : modules) {
            module.setChildren(selectByPid(module.getId()));
        }
        return modules;
    }
}
