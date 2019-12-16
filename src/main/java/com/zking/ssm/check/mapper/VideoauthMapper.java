package com.zking.ssm.check.mapper;

import com.zking.ssm.check.model.Videoauth;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoauthMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Videoauth record);

    int insertSelective(Videoauth record);

    Videoauth selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Videoauth record);

    int updateByPrimaryKey(Videoauth record);
}