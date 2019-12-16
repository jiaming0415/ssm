package com.zking.ssm.borrowing.service;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.borrowing.model.Bid;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IBidService {
    int deleteByPrimaryKey(Bid record);

    int insert(Bid record);

    int insertSelective(Bid record);

    Bid selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Bid record);

    int updateByPrimaryKey(Bid record);

    List<Bid> queryBidList(int id);

    List<Bid> queryBidListId(int id);
    List<Bid> queryBidListIdPager(int id, PageBean pageBean);

    List<Bid> queryList(Bid record);
}