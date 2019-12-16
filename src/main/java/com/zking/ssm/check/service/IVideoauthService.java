package com.zking.ssm.check.service;

import com.zking.ssm.check.model.Videoauth;

public interface IVideoauthService {
    int deleteByPrimaryKey(Long id);

    int insert(Videoauth record);

    int insertSelective(Videoauth record);

    Videoauth selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Videoauth record);

    int updateByPrimaryKey(Videoauth record);
}