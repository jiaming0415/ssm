package com.zking.ssm.system.mapper;

import com.zking.ssm.system.model.Role;
import com.zking.ssm.system.model.Systemdictionary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {
    int deleteByPrimaryKey(String roleid);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(String roleid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);


    List<Role> selectListPager(Role record);
}