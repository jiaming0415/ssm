package com.zking.ssm.borrowing.mapper;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.borrowing.model.Bid;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BidMapper {
    int deleteByPrimaryKey(Bid record);

    int insert(Bid record);

    int insertSelective(Bid record);

    Bid selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Bid record);

    int updateByPrimaryKey(Bid record);
    //查询投资人bidrequest_id
    List<Bid> queryBidList(int id);
    //查询自己投资的bidUser_id
    List<Bid> queryBidListId(int id);
    List<Bid> queryBidListIdPager(int id);

    List<Bid> queryList(Bid record);
}