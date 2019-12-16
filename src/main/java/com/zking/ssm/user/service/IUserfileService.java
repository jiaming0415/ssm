package com.zking.ssm.user.service;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.user.model.Userfile;
import com.zking.ssm.user.model.Userinfo;

import java.util.List;
import java.util.Map;

public interface IUserfileService {
    int deleteByPrimaryKey(Long id);

    int insert(Userfile record);

    int insertSelective(Userfile record);

    Userfile selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Userfile record);

    int updateByPrimaryKey(Userfile record);

    List<Userfile> selectOne(Long applierId);

    List<Map> selectPager(Userfile record, PageBean pageBean);
}