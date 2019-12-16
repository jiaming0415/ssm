package com.zking.ssm.borrowing.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.borrowing.model.Bid;
import com.zking.ssm.borrowing.model.Paymentschedule;
import com.zking.ssm.borrowing.service.IBidService;
import com.zking.ssm.borrowing.service.IPaymentscheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/bid")
public class BidController {
    @Autowired
    private IBidService bidService;
    @Autowired
    private IPaymentscheduleService paymentscheduleService;

    @RequestMapping("/queryBidList")
    @CrossOrigin
    @ResponseBody
    public List<Bid> queryBidList(int id) {
        return bidService.queryBidList(id);
    }

    @RequestMapping("/addBid")
    @CrossOrigin
    @ResponseBody
    public int insert(Bid record) {
        //  record.setBidtime(new Date());
        if(record.getBidrequeststate()==null){
            record.setBidrequeststate(0);
        }
        return bidService.insert(record);
    }
    @RequestMapping("/queryBidListId")
    @CrossOrigin
    @ResponseBody
    public List queryBidListId(int id) {

        List<Bid> bids = bidService.queryBidListId(id);
        List<Paymentschedule> list = new ArrayList<Paymentschedule>();
        for (Bid bid : bids) {
            System.out.println(bid.getBidrequestId());
            Paymentschedule paymentschedule = paymentscheduleService.queryPaymentscheduleBybidRequestid(bid.getBidrequestId());
            list.add(paymentschedule);
        }
        return list;
    }


    @RequestMapping("/queryBidListIdPager")
    @CrossOrigin
    @ResponseBody
    public Map<Object,Object> queryBidListIdPager(int id, PageBean pageBean) {
        Map<Object,Object> map=new HashMap<Object,Object>();
        if(null != pageBean&& pageBean.isPagination()){
            //第一个参数:当前页码
            //第二个参数:每页显示行数
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        System.out.println(pageBean);
        List<Bid> bids = bidService.queryBidListId(id);
        List<Paymentschedule> list = new ArrayList<Paymentschedule>();
        for (Bid bid : bids) {
            System.out.println(bid.getBidrequestId());
            Paymentschedule paymentschedule = paymentscheduleService.queryPaymentscheduleBybidRequestid(bid.getBidrequestId());
            list.add(paymentschedule);
        }

        map.put("records",list);
        if(null != pageBean&&pageBean.isPagination()){
            PageInfo pageInfo = new PageInfo(list);
            System.out.println("页码：" + pageInfo.getPageNum());
            System.out.println("页大小：" + pageInfo.getPageSize());
            System.out.println("总记录：" + pageInfo.getTotal());
            pageBean.setTotal((int)pageInfo.getTotal());
            pageBean.setTotal(pageInfo.getTotal()+"");
        }
        map.put("pageBean",pageBean);
        for (Paymentschedule record1 : list) {
            System.out.println(record1);
        }

        System.out.println(pageBean);

        return map;
    }


    @RequestMapping("/deleteByPrimaryKey")
    @CrossOrigin
    @ResponseBody
    public int deleteByPrimaryKey(Bid record) {
        int i = bidService.deleteByPrimaryKey(record);
        return 0;
    }


    @RequestMapping("/queryList")
    @CrossOrigin
    @ResponseBody
    public String queryList(Bid record) {
        List<Bid> bids = bidService.queryList(record);
        int a = 0;
        for (Bid bid : bids) {
            BigDecimal b = bid.getAvailableamount();
            a += b.intValue();
        }
        return a + "";
    }
}

