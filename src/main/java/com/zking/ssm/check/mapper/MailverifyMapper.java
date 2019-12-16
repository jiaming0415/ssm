package com.zking.ssm.check.mapper;

import com.zking.ssm.check.model.Mailverify;
import org.springframework.stereotype.Repository;

@Repository
public interface MailverifyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Mailverify record);

    int insertSelective(Mailverify record);

    Mailverify selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Mailverify record);

    int updateByPrimaryKey(Mailverify record);
}