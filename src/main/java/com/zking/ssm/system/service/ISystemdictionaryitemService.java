package com.zking.ssm.system.service;

import com.zking.ssm.system.model.Systemdictionaryitem;

import java.util.List;

public interface ISystemdictionaryitemService {
    int deleteByPrimaryKey(Long id);

    int insert(Systemdictionaryitem record);

    int insertSelective(Systemdictionaryitem record);

    Systemdictionaryitem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Systemdictionaryitem record);

    int updateByPrimaryKey(Systemdictionaryitem record);

    List<Systemdictionaryitem> selectByParentid(Long parentid);

    List<Systemdictionaryitem> queryAll();
}