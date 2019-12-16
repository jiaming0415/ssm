package com.zking.ssm.check.mapper;

import com.zking.ssm.check.model.Realauth;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface RealauthMapper {
    int deleteByPrimaryKey(Long id);

    int deleteByUserid(Long id);

    int insert(Realauth record);

    int insertSelective(Realauth record);

    Realauth selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Realauth record);

    int updateByPrimaryKey(Realauth record);

    Realauth selectByapplierId(Long applierId);

    List<Map>selectAll(Realauth realauth);

}