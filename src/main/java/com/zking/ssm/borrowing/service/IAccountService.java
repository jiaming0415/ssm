package com.zking.ssm.borrowing.service;

import com.zking.ssm.borrowing.model.Account;
import org.springframework.stereotype.Repository;

public interface IAccountService {
    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);

    int updateByLoginfoid(Account account);

    Account selectByLoginfoid(Integer logininfoid);
}