package com.zking.ssm.check.mapper;

import com.zking.ssm.check.model.Bidrequest;
import org.springframework.stereotype.Repository;

@Repository
public interface BidrequestMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Bidrequest record);

    int insertSelective(Bidrequest record);

    Bidrequest selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Bidrequest record);

    int updateByPrimaryKey(Bidrequest record);
}