package com.zking.ssm.check.mapper;

import com.zking.ssm.check.model.Rechargeoffline;
import org.springframework.stereotype.Repository;

@Repository
public interface RechargeofflineMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rechargeoffline record);

    int insertSelective(Rechargeoffline record);

    Rechargeoffline selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rechargeoffline record);

    int updateByPrimaryKey(Rechargeoffline record);
}