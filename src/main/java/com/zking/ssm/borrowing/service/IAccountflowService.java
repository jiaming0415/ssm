package com.zking.ssm.borrowing.service;

import com.zking.ssm.borrowing.model.Accountflow;
import org.springframework.stereotype.Repository;

public interface IAccountflowService {
    int deleteByPrimaryKey(Long id);

    int insert(Accountflow record);

    int insertSelective(Accountflow record);

    Accountflow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Accountflow record);

    int updateByPrimaryKey(Accountflow record);
}