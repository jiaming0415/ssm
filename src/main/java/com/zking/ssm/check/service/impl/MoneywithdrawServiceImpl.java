package com.zking.ssm.check.service.impl;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.check.mapper.MoneywithdrawMapper;
import com.zking.ssm.check.model.Moneywithdraw;
import com.zking.ssm.check.service.IMoneywithdrawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MoneywithdrawServiceImpl implements IMoneywithdrawService {
    @Autowired
    private MoneywithdrawMapper mapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Moneywithdraw record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Moneywithdraw record) {
        return mapper.insertSelective(record);
    }

    @Override
    public Moneywithdraw selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Moneywithdraw record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Moneywithdraw record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Map> queryMoneywithdrawPager(Moneywithdraw moneywithdraw, PageBean pageBean) {
        return mapper.queryMoneywithdrawPager(moneywithdraw);
    }

    @Override
    public int updateState(Moneywithdraw moneywithdraw) {
        return  mapper.updateState(moneywithdraw);
    }


}
