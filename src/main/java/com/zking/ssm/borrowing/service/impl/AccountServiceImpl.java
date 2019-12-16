package com.zking.ssm.borrowing.service.impl;

import com.zking.ssm.borrowing.mapper.AccountMapper;
import com.zking.ssm.borrowing.model.Account;
import com.zking.ssm.borrowing.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return accountMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Account record) {
        return accountMapper.insert(record);
    }

    @Override
    public int insertSelective(Account record) {
        return accountMapper.insertSelective(record);
    }

    @Override
    public Account selectByPrimaryKey(Integer id) {
        return accountMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Account record) {
        return accountMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Account record) {
        return accountMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByLoginfoid(Account account) {
        return accountMapper.updateByLoginfoid(account);
    }

    @Override
    public Account selectByLoginfoid(Integer logininfoid) {
        return accountMapper.selectByLoginfoid(logininfoid);
    }
}
