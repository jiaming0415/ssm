package com.zking.ssm.system.service.impl;

import com.zking.ssm.system.mapper.SystemdictionaryitemMapper;
import com.zking.ssm.system.model.Systemdictionaryitem;
import com.zking.ssm.system.service.ISystemdictionaryitemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.accept.MappingMediaTypeFileExtensionResolver;

import java.util.List;

@Service
public class SystemdictionaryitemServiceImpl implements ISystemdictionaryitemService {
    @Autowired
    private SystemdictionaryitemMapper mapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Systemdictionaryitem record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Systemdictionaryitem record) {
        return mapper.insertSelective(record);
    }

    @Override
    public Systemdictionaryitem selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Systemdictionaryitem record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Systemdictionaryitem record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Systemdictionaryitem> selectByParentid(Long parentid) {
        return mapper.selectByParentid(parentid);
    }
    @Override
    public List<Systemdictionaryitem> queryAll() {
        return mapper.queryAll();
    }
}
