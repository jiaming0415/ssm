package com.zking.ssm.borrowing.mapper;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.borrowing.model.Paymentschedule;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentscheduleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Paymentschedule record);

    int insertSelective(Paymentschedule record);

    Paymentschedule selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Paymentschedule record);

    int updateByPrimaryKey(Paymentschedule record);
    //查询投标
    List<Paymentschedule> queryPaymentscheduleList(String jd);
    List<Paymentschedule> queryPaymentschedulePagerList(String jd);

    List<Paymentschedule> queryPaymentscheduleAll();

    List<Paymentschedule> queryPaymentschedulePager();
    //查询个人借款信息
    List<Paymentschedule> queryPaymentscheduleByid(int id);
    List<Paymentschedule> queryPaymentscheduleByidPager(int id);
    //查询个人投标信息

    //查询最后一条数据
    Paymentschedule selectPrimary();


    //根据bidrequest_id查询
    Paymentschedule queryPaymentscheduleBybidRequestid(long id);


    //审核查询
    List<Paymentschedule> queryPaymentscheduleList2();
    List<Paymentschedule> queryPaymentscheduleList3();


    List<Paymentschedule> queryPaymentschedulePagerList2();
    List<Paymentschedule> queryPaymentschedulePagerList3();
    //修改状态
    int updateByPrimaryKeyjd(Paymentschedule record);


    //还款
    List<Paymentschedule> queryjkListPager1();
    List<Paymentschedule> queryjkListPager2();
    List<Paymentschedule> queryjkListPager3();
    List<Paymentschedule> queryhkListPager1();
    List<Paymentschedule> queryhkListPager2();
    List<Paymentschedule> queryhkListPager3();
    List<Paymentschedule> queryyqListPager();
}