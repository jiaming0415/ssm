package com.zking.ssm.check.service;

import com.zking.ssm.check.model.Emailverify;

public interface IEmailverifyService {
    int deleteByPrimaryKey(Long id);

    int insert(Emailverify record);

    int insertSelective(Emailverify record);

    Emailverify selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Emailverify record);

    int updateByPrimaryKey(Emailverify record);
}