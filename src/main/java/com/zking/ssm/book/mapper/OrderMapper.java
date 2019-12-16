package com.zking.ssm.book.mapper;

import com.zking.ssm.book.model.Order;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public interface OrderMapper {


    Order querySingleOrderByManyToOne(Integer orderId);
}