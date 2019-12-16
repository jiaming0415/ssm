package com.zking.ssm.book.service.imp;

import com.zking.ssm.book.mapper.OrderMapper;
import com.zking.ssm.book.model.Order;
import com.zking.ssm.book.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order querySingleOrderByManyToOne(Integer orderId) {
        return orderMapper.querySingleOrderByManyToOne(orderId);
    }
}
