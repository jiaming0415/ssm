package com.zking.ssm.check.service.impl;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.check.mapper.RealauthMapper;
import com.zking.ssm.check.model.Realauth;
import com.zking.ssm.check.service.IRealauthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RealauthServiceImpl implements IRealauthService {
    @Autowired
    private RealauthMapper mapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Realauth record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Realauth record) {
        return mapper.insertSelective(record);
    }

    @Override
    public Realauth selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Realauth record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Realauth record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public Realauth selectByapplierId(Long applierId) {
        return mapper.selectByapplierId(applierId);
    }

    @Override
    public List<Map> selectPager(Realauth realauth, PageBean pageBean) {
        return mapper.selectAll(realauth);
    }

    @Override
    public int deleteByUserid(Long id) {
        return mapper.deleteByUserid(id);
    }
}
