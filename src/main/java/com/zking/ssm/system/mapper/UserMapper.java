package com.zking.ssm.system.mapper;

import com.zking.ssm.system.model.Module;
import com.zking.ssm.system.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectListPager(User record);

    User userlogin(User record);

    List<Module> selectModuleByUserid(User record);
}