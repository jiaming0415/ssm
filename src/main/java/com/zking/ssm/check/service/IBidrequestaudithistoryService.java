package com.zking.ssm.check.service;

import com.zking.ssm.check.model.Bidrequestaudithistory;

public interface IBidrequestaudithistoryService {
    int deleteByPrimaryKey(Long id);

    int insert(Bidrequestaudithistory record);

    int insertSelective(Bidrequestaudithistory record);

    Bidrequestaudithistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Bidrequestaudithistory record);

    int updateByPrimaryKey(Bidrequestaudithistory record);
}