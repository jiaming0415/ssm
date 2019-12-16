package com.zking.ssm.user.mapper;

import com.zking.ssm.user.model.Userinfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserinfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);

    List<Userinfo> selectListPager(Userinfo record);


    int register(Userinfo user);

    Userinfo login (Userinfo userinfo);

}