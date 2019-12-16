package com.zking.ssm.check.mapper;

import com.zking.ssm.check.model.Bidrequestaudithistory;
import org.springframework.stereotype.Repository;

@Repository
public interface BidrequestaudithistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Bidrequestaudithistory record);

    int insertSelective(Bidrequestaudithistory record);

    Bidrequestaudithistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Bidrequestaudithistory record);

    int updateByPrimaryKey(Bidrequestaudithistory record);
}