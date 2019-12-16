package com.zking.ssm.system.mapper;

import com.zking.ssm.system.model.UserRole;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleMapper {
    int insert(UserRole record);

    int insertSelective(UserRole record);

    List<UserRole> queryListByUseridAndRoleid(UserRole record);

    int deleteByUseridAndRoleid(UserRole record);

}