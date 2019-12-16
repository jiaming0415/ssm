package com.zking.ssm.user.mapper;

import com.zking.ssm.user.model.Logininfo;
import org.springframework.stereotype.Repository;

@Repository
public interface LogininfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Logininfo record);

    int insertSelective(Logininfo record);

    Logininfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Logininfo record);

    int updateByPrimaryKey(Logininfo record);
}