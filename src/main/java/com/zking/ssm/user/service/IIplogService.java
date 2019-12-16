package com.zking.ssm.user.service;

import com.zking.ssm.user.model.Iplog;

public interface IIplogService {
    int deleteByPrimaryKey(Long id);

    int insert(Iplog record);

    int insertSelective(Iplog record);

    Iplog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Iplog record);

    int updateByPrimaryKey(Iplog record);
}