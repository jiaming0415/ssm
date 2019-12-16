package com.zking.ssm.check.mapper;

import com.zking.ssm.check.model.Emailverify;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailverifyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Emailverify record);

    int insertSelective(Emailverify record);

    Emailverify selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Emailverify record);

    int updateByPrimaryKey(Emailverify record);
}