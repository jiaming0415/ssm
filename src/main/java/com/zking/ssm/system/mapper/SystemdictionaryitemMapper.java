package com.zking.ssm.system.mapper;

import com.zking.ssm.system.model.Systemdictionaryitem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SystemdictionaryitemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Systemdictionaryitem record);

    int insertSelective(Systemdictionaryitem record);

    Systemdictionaryitem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Systemdictionaryitem record);

    int updateByPrimaryKey(Systemdictionaryitem record);

    List<Systemdictionaryitem> selectByParentid(Long parentid);

    List<Systemdictionaryitem> queryAll();
}