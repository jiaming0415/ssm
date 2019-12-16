package com.zking.ssm.borrowing.service;

import com.zking.ssm.borrowing.model.Paymentscheduledetail;
import org.springframework.stereotype.Repository;

public interface IPaymentscheduledetailService {
    int deleteByPrimaryKey(String id);

    int insert(Paymentscheduledetail record);

    int insertSelective(Paymentscheduledetail record);

    Paymentscheduledetail selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Paymentscheduledetail record);

    int updateByPrimaryKey(Paymentscheduledetail record);
}