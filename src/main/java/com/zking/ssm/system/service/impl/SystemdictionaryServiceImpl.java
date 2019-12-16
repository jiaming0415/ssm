package com.zking.ssm.system.service.impl;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.system.mapper.SystemdictionaryMapper;
import com.zking.ssm.system.model.Systemdictionary;
import com.zking.ssm.system.service.ISystemdictionaryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemdictionaryServiceImpl implements ISystemdictionaryService {
    @Autowired
    private SystemdictionaryMapper mapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Systemdictionary record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Systemdictionary record) {
        return mapper.insertSelective(record);
    }

    @Override
    public Systemdictionary selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Systemdictionary record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Systemdictionary record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Systemdictionary> selectListPager(Systemdictionary systemdictionary, PageBean pageBean) {
        return mapper.selectListPager(systemdictionary);
    }
}
