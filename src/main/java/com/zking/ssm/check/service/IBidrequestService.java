package com.zking.ssm.check.service;

import com.zking.ssm.check.model.Bidrequest;

public interface IBidrequestService {
    int deleteByPrimaryKey(Long id);

    int insert(Bidrequest record);

    int insertSelective(Bidrequest record);

    Bidrequest selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Bidrequest record);

    int updateByPrimaryKey(Bidrequest record);
}