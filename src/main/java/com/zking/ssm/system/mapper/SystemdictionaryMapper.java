package com.zking.ssm.system.mapper;

import com.zking.ssm.system.model.Systemdictionary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SystemdictionaryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Systemdictionary record);

    int insertSelective(Systemdictionary record);

    Systemdictionary selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Systemdictionary record);

    int updateByPrimaryKey(Systemdictionary record);

    List<Systemdictionary> selectListPager(Systemdictionary systemdictionary);
}