package com.zking.ssm.borrowing.service.impl;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.borrowing.mapper.PaymentscheduleMapper;
import com.zking.ssm.borrowing.model.Paymentschedule;
import com.zking.ssm.borrowing.service.IPaymentscheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentscheduleServiceImpl implements IPaymentscheduleService {
    @Autowired
    private PaymentscheduleMapper mapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Paymentschedule record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Paymentschedule record) {
        return mapper.insertSelective(record);
    }

    @Override
    public Paymentschedule selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Paymentschedule record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Paymentschedule record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Paymentschedule> queryPaymentscheduleList(String jd) {
        return mapper.queryPaymentscheduleList(jd);
    }

    @Override
    public List<Paymentschedule> queryPaymentschedulePagerList(String jd, PageBean pageBean) {
        return mapper.queryPaymentschedulePagerList(jd);
    }

    @Override
    public List<Paymentschedule> queryPaymentscheduleAll() {
        return mapper.queryPaymentscheduleAll();
    }

    @Override
    public List<Paymentschedule> queryPaymentschedulePager(PageBean pageBean) {
        return mapper.queryPaymentschedulePager();
    }

    @Override
    public List<Paymentschedule> queryPaymentscheduleByid(int id) {
        return mapper.queryPaymentscheduleByid(id);
    }

    @Override
    public List<Paymentschedule> queryPaymentscheduleByidPager(int id, PageBean pageBean) {
        return mapper.queryPaymentscheduleByidPager(id);
    }

    @Override
    public Paymentschedule selectPrimary() {
        return mapper.selectPrimary();
    }

    @Override
    public Paymentschedule queryPaymentscheduleBybidRequestid(long id) {
        return mapper.queryPaymentscheduleBybidRequestid(id);
    }

    @Override
    public List<Paymentschedule> queryPaymentscheduleList2() {
        return mapper.queryPaymentscheduleList2();
    }

    @Override
    public List<Paymentschedule> queryPaymentscheduleList3() {
        return mapper.queryPaymentscheduleList3();
    }

    @Override
    public List<Paymentschedule> queryPaymentschedulePagerList2(PageBean pageBean) {
        return mapper.queryPaymentschedulePagerList2();
    }

    @Override
    public List<Paymentschedule> queryPaymentschedulePagerList3(PageBean pageBean) {
        return mapper.queryPaymentschedulePagerList3();
    }

    @Override
    public int updateByPrimaryKeyjd(Paymentschedule record) {
        return mapper.updateByPrimaryKeyjd(record);
    }

    @Override
    public List<Paymentschedule> queryhkListPager1(  PageBean pageBean) {
        return mapper.queryhkListPager1();
    }
    @Override
    public List<Paymentschedule> queryhkListPager2(  PageBean pageBean) {
        return mapper.queryhkListPager2();
    }
    @Override
    public List<Paymentschedule> queryhkListPager3(  PageBean pageBean) {
        return mapper.queryhkListPager3();
    }

    @Override
    public List<Paymentschedule> queryjkListPager1(  PageBean pageBean) {
        return mapper.queryjkListPager1();
    }

    @Override
    public List<Paymentschedule> queryjkListPager2(  PageBean pageBean) {
        return mapper.queryjkListPager2();
    }

    @Override
    public List<Paymentschedule> queryjkListPager3( PageBean pageBean) {
        return mapper.queryjkListPager3();
    }

    @Override
    public List<Paymentschedule> queryyqListPager(PageBean pageBean) {
        return mapper.queryyqListPager();
    }
}
