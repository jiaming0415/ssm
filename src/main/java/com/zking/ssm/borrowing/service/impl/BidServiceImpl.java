package com.zking.ssm.borrowing.service.impl;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.borrowing.mapper.BidMapper;
import com.zking.ssm.borrowing.model.Bid;
import com.zking.ssm.borrowing.service.IBidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BidServiceImpl implements IBidService {
    @Autowired
    private BidMapper bidMapper;

    @Override
    public int deleteByPrimaryKey(Bid record) {
        return bidMapper.deleteByPrimaryKey(record);
    }

    @Override
    public int insert(Bid record) {
        return bidMapper.insert(record);
    }

    @Override
    public int insertSelective(Bid record) {
        return bidMapper.insertSelective(record);
    }

    @Override
    public Bid selectByPrimaryKey(Long id) {
        return bidMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Bid record) {
        return bidMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Bid record) {
        return bidMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Bid> queryBidList(int id) {
        return bidMapper.queryBidList(id);
    }

    @Override
    public List<Bid> queryBidListId(int id) {
        return bidMapper.queryBidListId(id);
    }

    @Override
    public List<Bid> queryBidListIdPager(int id, PageBean pageBean) {
        return bidMapper.queryBidListIdPager(id);
    }

    @Override
    public List<Bid> queryList(Bid record) {
        return bidMapper.queryList(record);
    }
}
