package com.zking.ssm.check.mapper;

import com.zking.ssm.check.model.Moneywithdraw;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface MoneywithdrawMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Moneywithdraw record);

    int insertSelective(Moneywithdraw record);

    Moneywithdraw selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Moneywithdraw record);

    int updateByPrimaryKey(Moneywithdraw record);

    List<Map> queryMoneywithdrawPager(Moneywithdraw moneywithdraw);

    int updateState(Moneywithdraw moneywithdraw);
}