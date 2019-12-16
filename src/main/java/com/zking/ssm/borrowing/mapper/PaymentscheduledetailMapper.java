package com.zking.ssm.borrowing.mapper;

import com.zking.ssm.borrowing.model.Paymentscheduledetail;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentscheduledetailMapper {
    int deleteByPrimaryKey(String id);

    int insert(Paymentscheduledetail record);

    int insertSelective(Paymentscheduledetail record);

    Paymentscheduledetail selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Paymentscheduledetail record);

    int updateByPrimaryKey(Paymentscheduledetail record);

}