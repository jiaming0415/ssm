package com.zking.ssm.system.mapper;

import com.zking.ssm.system.model.RoleModule;
import com.zking.ssm.system.model.UserRole;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleModuleMapper {
    int insert(RoleModule record);

    int insertSelective(RoleModule record);


    List<RoleModule> queryListByModuleidAndRoleid(RoleModule record);

    int deleteByModuleidAndRoleid(RoleModule record);

}