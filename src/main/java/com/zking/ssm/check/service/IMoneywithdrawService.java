package com.zking.ssm.check.service;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.check.model.Moneywithdraw;

import java.util.List;
import java.util.Map;

public interface IMoneywithdrawService {
    int deleteByPrimaryKey(Long id);

    int insert(Moneywithdraw record);

    int insertSelective(Moneywithdraw record);

    Moneywithdraw selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Moneywithdraw record);

    int updateByPrimaryKey(Moneywithdraw record);

    List<Map> queryMoneywithdrawPager(Moneywithdraw moneywithdraw, PageBean pageBean);

    int updateState(Moneywithdraw moneywithdraw);
}