package com.zking.ssm.borrowing.service.impl;

import com.zking.ssm.borrowing.mapper.AccountflowMapper;
import com.zking.ssm.borrowing.model.Accountflow;
import com.zking.ssm.borrowing.service.IAccountflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountflowServiceImpl implements IAccountflowService {

    @Autowired
    private AccountflowMapper accountflowMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return accountflowMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Accountflow record) {
        return accountflowMapper.insert(record);
    }

    @Override
    public int insertSelective(Accountflow record) {
        return accountflowMapper.insertSelective(record);
    }

    @Override
    public Accountflow selectByPrimaryKey(Long id) {
        return accountflowMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Accountflow record) {
        return accountflowMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Accountflow record) {
        return accountflowMapper.updateByPrimaryKey(record);
    }
}
