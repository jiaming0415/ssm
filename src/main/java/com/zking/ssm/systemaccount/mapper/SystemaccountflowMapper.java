package com.zking.ssm.systemaccount.mapper;

import com.zking.ssm.systemaccount.model.Systemaccountflow;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemaccountflowMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Systemaccountflow record);

    int insertSelective(Systemaccountflow record);

    Systemaccountflow selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Systemaccountflow record);

    int updateByPrimaryKey(Systemaccountflow record);
}