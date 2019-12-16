package com.zking.ssm.book.service;

import com.zking.ssm.book.model.Order;
import org.springframework.stereotype.Repository;


public interface IOrderService {

    Order querySingleOrderByManyToOne(Integer orderId);
}