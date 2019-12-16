package com.zking.ssm.check.service;

import com.zking.ssm.check.model.Mailverify;

public interface IMailverifyService {
    int deleteByPrimaryKey(Long id);

    int insert(Mailverify record);

    int insertSelective(Mailverify record);

    Mailverify selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Mailverify record);

    int updateByPrimaryKey(Mailverify record);
}