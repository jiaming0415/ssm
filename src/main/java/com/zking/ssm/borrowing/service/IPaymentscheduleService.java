package com.zking.ssm.borrowing.service;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.borrowing.model.Paymentschedule;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IPaymentscheduleService {
    int deleteByPrimaryKey(Long id);

    int insert(Paymentschedule record);

    int insertSelective(Paymentschedule record);

    Paymentschedule selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Paymentschedule record);

    int updateByPrimaryKey(Paymentschedule record);

    List<Paymentschedule> queryPaymentscheduleList(String jd);

    List<Paymentschedule> queryPaymentschedulePagerList(String jd,PageBean pageBean);

    List<Paymentschedule> queryPaymentscheduleAll();

    List<Paymentschedule> queryPaymentschedulePager( PageBean pageBean);


    List<Paymentschedule> queryPaymentscheduleByid(int id);
    List<Paymentschedule> queryPaymentscheduleByidPager(int id,PageBean pageBean);
    Paymentschedule selectPrimary();

    Paymentschedule queryPaymentscheduleBybidRequestid(long id);


    //审核查询
    List<Paymentschedule> queryPaymentscheduleList2();
    List<Paymentschedule> queryPaymentscheduleList3();

    //分页
    List<Paymentschedule> queryPaymentschedulePagerList2(PageBean pageBean);
    List<Paymentschedule> queryPaymentschedulePagerList3(PageBean pageBean);
    //修改状态
    int updateByPrimaryKeyjd(Paymentschedule record);


    //还款
    List<Paymentschedule> queryjkListPager1(PageBean pageBean);
    List<Paymentschedule> queryjkListPager2(PageBean pageBean);
    List<Paymentschedule> queryjkListPager3(PageBean pageBean);
    List<Paymentschedule> queryhkListPager1(PageBean pageBean);
    List<Paymentschedule> queryhkListPager2(PageBean pageBean);
    List<Paymentschedule> queryhkListPager3(PageBean pageBean);
    List<Paymentschedule> queryyqListPager(PageBean pageBean);

}