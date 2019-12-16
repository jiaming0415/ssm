package com.zking.ssm.system.service;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.system.model.Systemdictionary;

import java.util.List;

public interface ISystemdictionaryService {
    int deleteByPrimaryKey(Long id);

    int insert(Systemdictionary record);

    int insertSelective(Systemdictionary record);

    Systemdictionary selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Systemdictionary record);

    int updateByPrimaryKey(Systemdictionary record);

    List<Systemdictionary> selectListPager(Systemdictionary systemdictionary,PageBean pageBean);

}