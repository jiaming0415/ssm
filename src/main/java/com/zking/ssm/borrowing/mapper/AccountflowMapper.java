package com.zking.ssm.borrowing.mapper;

import com.zking.ssm.borrowing.model.Accountflow;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountflowMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Accountflow record);

    int insertSelective(Accountflow record);

    Accountflow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Accountflow record);

    int updateByPrimaryKey(Accountflow record);
}