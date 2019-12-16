package com.zking.ssm.user.mapper;

import com.zking.ssm.user.model.Iplog;
import org.springframework.stereotype.Repository;

@Repository
public interface IplogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Iplog record);

    int insertSelective(Iplog record);

    Iplog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Iplog record);

    int updateByPrimaryKey(Iplog record);
}