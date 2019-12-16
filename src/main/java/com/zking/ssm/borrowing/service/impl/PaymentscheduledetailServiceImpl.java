package com.zking.ssm.borrowing.service.impl;

import com.zking.ssm.borrowing.mapper.PaymentscheduledetailMapper;
import com.zking.ssm.borrowing.model.Paymentscheduledetail;
import com.zking.ssm.borrowing.service.IPaymentscheduledetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentscheduledetailServiceImpl implements IPaymentscheduledetailService {
    @Autowired
    private PaymentscheduledetailMapper mapper;
    @Override
    public int deleteByPrimaryKey(String id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Paymentscheduledetail record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Paymentscheduledetail record) {
        return mapper.insertSelective(record);
    }

    @Override
    public Paymentscheduledetail selectByPrimaryKey(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Paymentscheduledetail record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Paymentscheduledetail record) {
        return mapper.updateByPrimaryKey(record);
    }
}
