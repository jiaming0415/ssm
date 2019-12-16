package com.zking.ssm.check.service.impl;

import com.zking.ssm.check.mapper.VideoauthMapper;
import com.zking.ssm.check.model.Videoauth;
import com.zking.ssm.check.service.IVideoauthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoauthServiceImpl implements IVideoauthService {
    @Autowired
    private VideoauthMapper mapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Videoauth record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Videoauth record) {
        return mapper.insertSelective(record);
    }

    @Override
    public Videoauth selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Videoauth record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Videoauth record) {
        return mapper.updateByPrimaryKey(record);
    }
}
