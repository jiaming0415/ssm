package com.zking.ssm.systemaccount.mapper;

import com.zking.ssm.systemaccount.model.Systemaccount;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemaccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Systemaccount record);

    int insertSelective(Systemaccount record);

    Systemaccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Systemaccount record);

    int updateByPrimaryKey(Systemaccount record);
}