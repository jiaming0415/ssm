package com.zking.ssm.check.service;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.check.model.Realauth;

import java.util.List;
import java.util.Map;

public interface IRealauthService {
    int deleteByPrimaryKey(Long id);

    int insert(Realauth record);

    int insertSelective(Realauth record);

    Realauth selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Realauth record);

    int updateByPrimaryKey(Realauth record);

    Realauth selectByapplierId(Long applierId);

    List<Map> selectPager(Realauth realauth, PageBean pageBean);

    int deleteByUserid(Long id);
}