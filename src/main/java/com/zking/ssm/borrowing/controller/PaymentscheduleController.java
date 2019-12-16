package com.zking.ssm.borrowing.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.borrowing.model.Account;
import com.zking.ssm.borrowing.model.Paymentschedule;
import com.zking.ssm.borrowing.service.IAccountService;
import com.zking.ssm.borrowing.service.IPaymentscheduleService;
import com.zking.ssm.borrowing.service.impl.PaymentscheduleServiceImpl;
import com.zking.ssm.user.model.Userinfo;
import com.zking.ssm.user.service.IUserinfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/paymentschedule")
@Slf4j
public class PaymentscheduleController {
    @Autowired
    private IPaymentscheduleService paymentscheduleService;
    @Autowired
    private IUserinfoService userinfoService;
    @Autowired
    private IAccountService accountService;

    @RequestMapping("/queryPaymentscheduleList")
    @CrossOrigin
    @ResponseBody
    public List<Paymentschedule> queryPaymentscheduleList(String jd) {
        List<Paymentschedule> list = paymentscheduleService.queryPaymentscheduleList(jd);
        return list;
    }

    @RequestMapping("/queryPaymentschedulePagerList")
    @CrossOrigin
    @ResponseBody
    public Map<Object, Object> queryPaymentschedulePagerList(String jd, PageBean pageBean) {
        Map<Object, Object> map = new HashMap<Object, Object>();
        if (null != pageBean && pageBean.isPagination()) {
            //第一个参数:当前页码
            //第二个参数:每页显示行数
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        System.out.println(pageBean);
        List<Paymentschedule> records = paymentscheduleService.queryPaymentschedulePagerList(jd, pageBean);
        map.put("records", records);
        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(records);
            System.out.println("页码：" + pageInfo.getPageNum());
            System.out.println("页大小：" + pageInfo.getPageSize());
            System.out.println("总记录：" + pageInfo.getTotal());
            pageBean.setTotal((int) pageInfo.getTotal());
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        map.put("pageBean", pageBean);
        for (Paymentschedule record1 : records) {
            System.out.println(record1);
        }

        System.out.println(pageBean);

        return map;
    }

    @RequestMapping("/queryPaymentschedulePager")
    @CrossOrigin
    @ResponseBody
    public Map<Object, Object> queryPaymentschedulePager(PageBean pageBean) {
        Map<Object, Object> map = new HashMap<Object, Object>();
        if (null != pageBean && pageBean.isPagination()) {
            //第一个参数:当前页码
            //第二个参数:每页显示行数
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        System.out.println(pageBean);
        List<Paymentschedule> records = paymentscheduleService.queryPaymentschedulePager(pageBean);
        map.put("records", records);
        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(records);
            System.out.println("页码：" + pageInfo.getPageNum());
            System.out.println("页大小：" + pageInfo.getPageSize());
            System.out.println("总记录：" + pageInfo.getTotal());
            pageBean.setTotal((int) pageInfo.getTotal());
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        map.put("pageBean", pageBean);
        for (Paymentschedule record1 : records) {
            System.out.println(record1);
        }

        System.out.println(pageBean);

        return map;
    }

    @RequestMapping("/queryPaymentscheduleAll")
    @CrossOrigin
    @ResponseBody
    public List<Paymentschedule> queryPaymentscheduleAll() {
        List<Paymentschedule> records = paymentscheduleService.queryPaymentscheduleAll();

        return records;
    }

    @RequestMapping("/queryUserInfo")
    @CrossOrigin
    @ResponseBody
    public Userinfo queryUserInfo(Long id) {
        Userinfo userinfo = userinfoService.selectByPrimaryKey(id );
        return userinfo;
    }

    @RequestMapping("/addPaymentschedule")
    @CrossOrigin
    @ResponseBody
    public Map<String, Object> insert(Paymentschedule record) {
        System.out.println(record);
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            int insert = paymentscheduleService.insert(record);
            System.out.println(insert);
            map.put("msg", "提交成功！有一天的等待时间，请耐心等待客服反馈！");

        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg", "提交失败！");
        }
        return map;
    }

    /**
     * 投资时调用修改已投资资金
     *
     * @param record
     * @return
     */
    @RequestMapping("/updateByPrimaryKeySelective")
    @CrossOrigin
    @ResponseBody
    public int updateByPrimaryKeySelective(Paymentschedule record) {
   /*     Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = df.format(day);

        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM");
        String format = dateFormat.format(date);
        System.out.println(format);*/
        Paymentschedule paymentschedule = paymentscheduleService.selectByPrimaryKey(record.getId());
        paymentschedule.setYtz(record.getYtz() + paymentschedule.getYtz());
        Double a = paymentschedule.getPrincipal().doubleValue();
        if (a == (double) paymentschedule.getYtz()) {
            paymentschedule.setJd((Integer) 3);
        }
        return paymentscheduleService.updateByPrimaryKey(paymentschedule);
    }
    @RequestMapping("/hk")
    @CrossOrigin
    @ResponseBody
    public int hk(Paymentschedule record) {
   /*     Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = df.format(day);

        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM");
        String format = dateFormat.format(date);
        System.out.println(format);*/
        Paymentschedule paymentschedule = paymentscheduleService.selectByPrimaryKey(record.getId());
        paymentschedule.setJd((Integer) 1);
        return paymentscheduleService.updateByPrimaryKey(paymentschedule);
    }
    /**
     * 撤资时调用修改已投资资金
     *
     * @param record
     * @return
     */
    @RequestMapping("/updateByPrimaryKeySelective1")
    @CrossOrigin
    @ResponseBody
    public int updateByPrimaryKeySelective1(Paymentschedule record) {
   /*     Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = df.format(day);

        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM");
        String format = dateFormat.format(date);
        System.out.println(format);*/
        Paymentschedule paymentschedule = paymentscheduleService.selectByPrimaryKey(record.getId());
        paymentschedule.setYtz(paymentschedule.getYtz() - record.getYtz());
        return paymentscheduleService.updateByPrimaryKey(paymentschedule);
    }

    @RequestMapping("/queryPaymentscheduleByid")
    @CrossOrigin
    @ResponseBody
    public List<Paymentschedule> queryPaymentscheduleByid(int id) {
        List<Paymentschedule> list = paymentscheduleService.queryPaymentscheduleByid(id);
        return list;
    }


    @RequestMapping("/queryPaymentscheduleByidPager")
    @CrossOrigin
    @ResponseBody
    public Map<Object, Object> queryPaymentscheduleByidPager(int id, PageBean pageBean) {

        Map<Object, Object> map = new HashMap<Object, Object>();
        if (null != pageBean && pageBean.isPagination()) {
            //第一个参数:当前页码
            //第二个参数:每页显示行数
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        System.out.println(pageBean);
        List<Paymentschedule> records = paymentscheduleService.queryPaymentscheduleByidPager(id, pageBean);
        map.put("records", records);
        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(records);
            System.out.println("页码：" + pageInfo.getPageNum());
            System.out.println("页大小：" + pageInfo.getPageSize());
            System.out.println("总记录：" + pageInfo.getTotal());
            pageBean.setTotal((int) pageInfo.getTotal());
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        map.put("pageBean", pageBean);
        for (Paymentschedule record1 : records) {
            System.out.println(record1);
        }

        System.out.println(pageBean);

        return map;
    }


    @RequestMapping("/deleteByPrimaryKey")
    @CrossOrigin
    @ResponseBody
    public int deleteByPrimaryKey(Long id) {
        return paymentscheduleService.deleteByPrimaryKey(id);
    }

    @RequestMapping("/selectPrimary")
    @CrossOrigin
    @ResponseBody
    public Paymentschedule selectPrimary() {

        return paymentscheduleService.selectPrimary();
    }


    //审核--------------------------------------------------------
    @RequestMapping("/queryPaymentscheduleList2")
    @CrossOrigin
    @ResponseBody
    public List<Paymentschedule> queryPaymentscheduleList2() {
        return paymentscheduleService.queryPaymentscheduleList2();
    }

    @RequestMapping("/queryPaymentscheduleList3")
    @CrossOrigin
    @ResponseBody
    public List<Paymentschedule> queryPaymentscheduleList3() {
        return paymentscheduleService.queryPaymentscheduleList3();
    }


    @RequestMapping("/queryPaymentschedulePagerList2")
    @CrossOrigin
    @ResponseBody
    public Map<Object, Object> queryPaymentschedulePagerList2(PageBean pageBean) {
        Map<Object, Object> map = new HashMap<Object, Object>();
        if (null != pageBean && pageBean.isPagination()) {
            //第一个参数:当前页码
            //第二个参数:每页显示行数
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        System.out.println(pageBean);
        List<Paymentschedule> records = paymentscheduleService.queryPaymentschedulePagerList2(pageBean);
        map.put("records", records);
        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(records);
            System.out.println("页码：" + pageInfo.getPageNum());
            System.out.println("页大小：" + pageInfo.getPageSize());
            System.out.println("总记录：" + pageInfo.getTotal());
            pageBean.setTotal((int) pageInfo.getTotal());
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        map.put("pageBean", pageBean);
        for (Paymentschedule record1 : records) {
            System.out.println(record1);
        }

        System.out.println(pageBean);

        return map;
    }

    @RequestMapping("/queryPaymentschedulePagerList3")
    @CrossOrigin
    @ResponseBody
    public Map<Object, Object> queryPaymentschedulePagerList3(PageBean pageBean) {
        Map<Object, Object> map = new HashMap<Object, Object>();
        if (null != pageBean && pageBean.isPagination()) {
            //第一个参数:当前页码
            //第二个参数:每页显示行数
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        System.out.println(pageBean);
        List<Paymentschedule> records = paymentscheduleService.queryPaymentschedulePagerList3(pageBean);
        map.put("records", records);
        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(records);
            System.out.println("页码：" + pageInfo.getPageNum());
            System.out.println("页大小：" + pageInfo.getPageSize());
            System.out.println("总记录：" + pageInfo.getTotal());
            pageBean.setTotal((int) pageInfo.getTotal());
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        map.put("pageBean", pageBean);
        for (Paymentschedule record1 : records) {
            System.out.println(record1);
        }

        System.out.println(pageBean);

        return map;
    }

    @RequestMapping("/updateByPrimaryKeyjd")
    @CrossOrigin
    @ResponseBody
    public int updateByPrimaryKeyjd(Paymentschedule record) {

        return paymentscheduleService.updateByPrimaryKeyjd(record);
    }


    @RequestMapping("/queryhkListPager2")
    @CrossOrigin
    @ResponseBody
    public Map<Object, Object> queryhkListPager2(PageBean pageBean) {
        Map<Object, Object> map = new HashMap<Object, Object>();
        if (null != pageBean && pageBean.isPagination()) {
            //第一个参数:当前页码
            //第二个参数:每页显示行数
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        System.out.println(pageBean);
        List<Paymentschedule> records = paymentscheduleService.queryhkListPager2(pageBean);

        map.put("records", records);
        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(records);
            System.out.println("页码：" + pageInfo.getPageNum());
            System.out.println("页大小：" + pageInfo.getPageSize());
            System.out.println("总记录：" + pageInfo.getTotal());
            pageBean.setTotal((int) pageInfo.getTotal());
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        map.put("pageBean", pageBean);
        for (Paymentschedule record1 : records) {
            System.out.println(record1);
        }

        System.out.println(pageBean);

        return map;
    }
    @RequestMapping("/queryhkListPager3")
    @CrossOrigin
    @ResponseBody
    public Map<Object, Object> queryhkListPager3(PageBean pageBean) {
        Map<Object, Object> map = new HashMap<Object, Object>();
        if (null != pageBean && pageBean.isPagination()) {
            //第一个参数:当前页码
            //第二个参数:每页显示行数
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        System.out.println(pageBean);
        List<Paymentschedule> records = paymentscheduleService.queryhkListPager3(pageBean);

        map.put("records", records);
        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(records);
            System.out.println("页码：" + pageInfo.getPageNum());
            System.out.println("页大小：" + pageInfo.getPageSize());
            System.out.println("总记录：" + pageInfo.getTotal());
            pageBean.setTotal((int) pageInfo.getTotal());
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        map.put("pageBean", pageBean);
        for (Paymentschedule record1 : records) {
            System.out.println(record1);
        }

        System.out.println(pageBean);

        return map;
    }
    @RequestMapping("/queryhkListPager1")
    @CrossOrigin
    @ResponseBody
    public Map<Object, Object> queryhkListPager1(PageBean pageBean) {
        Map<Object, Object> map = new HashMap<Object, Object>();
        if (null != pageBean && pageBean.isPagination()) {
            //第一个参数:当前页码
            //第二个参数:每页显示行数
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        System.out.println(pageBean);
        List<Paymentschedule> records = paymentscheduleService.queryhkListPager1(pageBean);

        map.put("records", records);
        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(records);
            System.out.println("页码：" + pageInfo.getPageNum());
            System.out.println("页大小：" + pageInfo.getPageSize());
            System.out.println("总记录：" + pageInfo.getTotal());
            pageBean.setTotal((int) pageInfo.getTotal());
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        map.put("pageBean", pageBean);
        for (Paymentschedule record1 : records) {
            System.out.println(record1);
        }

        System.out.println(pageBean);

        return map;
    }
    @RequestMapping("/queryjkListPager2")
    @CrossOrigin
    @ResponseBody
    public Map<Object, Object> queryjkListPager2(PageBean pageBean) {
        Map<Object, Object> map = new HashMap<Object, Object>();
        if (null != pageBean && pageBean.isPagination()) {
            //第一个参数:当前页码
            //第二个参数:每页显示行数
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        System.out.println(pageBean);
        List<Paymentschedule> records = paymentscheduleService.queryjkListPager2(pageBean);

        map.put("records", records);
        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(records);
            System.out.println("页码：" + pageInfo.getPageNum());
            System.out.println("页大小：" + pageInfo.getPageSize());
            System.out.println("总记录：" + pageInfo.getTotal());
            pageBean.setTotal((int) pageInfo.getTotal());
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        map.put("pageBean", pageBean);
        for (Paymentschedule record1 : records) {
            System.out.println(record1);
        }

        System.out.println(pageBean);

        return map;
    }
    @RequestMapping("/queryjkListPager3")
    @CrossOrigin
    @ResponseBody
    public Map<Object, Object> queryjkListPager3(PageBean pageBean) {
        Map<Object, Object> map = new HashMap<Object, Object>();
        if (null != pageBean && pageBean.isPagination()) {
            //第一个参数:当前页码
            //第二个参数:每页显示行数
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        System.out.println(pageBean);
        List<Paymentschedule> records = paymentscheduleService.queryjkListPager3(pageBean);

        map.put("records", records);
        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(records);
            System.out.println("页码：" + pageInfo.getPageNum());
            System.out.println("页大小：" + pageInfo.getPageSize());
            System.out.println("总记录：" + pageInfo.getTotal());
            pageBean.setTotal((int) pageInfo.getTotal());
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        map.put("pageBean", pageBean);
        for (Paymentschedule record1 : records) {
            System.out.println(record1);
        }

        System.out.println(pageBean);

        return map;
    }
    @RequestMapping("/queryjkListPager1")
    @CrossOrigin
    @ResponseBody
    public Map<Object, Object> queryjkListPager1( PageBean pageBean) {
        Map<Object, Object> map = new HashMap<Object, Object>();
        if (null != pageBean && pageBean.isPagination()) {
            //第一个参数:当前页码
            //第二个参数:每页显示行数
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        System.out.println(pageBean);
        List<Paymentschedule> records = paymentscheduleService.queryjkListPager1( pageBean);
        map.put("records", records);
        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(records);
            System.out.println("页码：" + pageInfo.getPageNum());
            System.out.println("页大小：" + pageInfo.getPageSize());
            System.out.println("总记录：" + pageInfo.getTotal());
            pageBean.setTotal((int) pageInfo.getTotal());
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        map.put("pageBean", pageBean);
        for (Paymentschedule record1 : records) {
            System.out.println(record1);
        }

        System.out.println(pageBean);

        return map;
    }

    @RequestMapping("/queryyqListPager")
    @CrossOrigin
    @ResponseBody
    public Map<Object, Object> queryyqListPager(PageBean pageBean) {
        Map<Object, Object> map = new HashMap<Object, Object>();
        if (null != pageBean && pageBean.isPagination()) {
            //第一个参数:当前页码
            //第二个参数:每页显示行数
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        System.out.println(pageBean);
        List<Paymentschedule> records = paymentscheduleService.queryyqListPager(pageBean);
        map.put("records", records);
        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(records);
            System.out.println("页码：" + pageInfo.getPageNum());
            System.out.println("页大小：" + pageInfo.getPageSize());
            System.out.println("总记录：" + pageInfo.getTotal());
            pageBean.setTotal((int) pageInfo.getTotal());
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        map.put("pageBean", pageBean);
        for (Paymentschedule record1 : records) {
            System.out.println(record1);
        }

        System.out.println(pageBean);

        return map;
    }
    @RequestMapping("/queryhkListPager")
    @CrossOrigin
    @ResponseBody
    public Map<Object, Object> queryhkListPager(PageBean pageBean) {
        Map<Object, Object> map = new HashMap<Object, Object>();
        if (null != pageBean && pageBean.isPagination()) {
            //第一个参数:当前页码
            //第二个参数:每页显示行数
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        System.out.println(pageBean);
        List<Paymentschedule> records=null;
        List<Paymentschedule> record1 = paymentscheduleService.queryhkListPager1(pageBean);
        List<Paymentschedule> record2 = paymentscheduleService.queryhkListPager2(pageBean);
        List<Paymentschedule> record3 = paymentscheduleService.queryhkListPager3(pageBean);
        for (Paymentschedule paymentschedule : record3) {
            records.add(paymentschedule);
        }
        for (Paymentschedule paymentschedule : record2) {
            records.add(paymentschedule);
        }
        for (Paymentschedule paymentschedule : record1) {
            records.add(paymentschedule);
        }
        map.put("records", records);
        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(records);
            System.out.println("页码：" + pageInfo.getPageNum());
            System.out.println("页大小：" + pageInfo.getPageSize());
            System.out.println("总记录：" + pageInfo.getTotal());
            pageBean.setTotal((int) pageInfo.getTotal());
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        map.put("pageBean", pageBean);


        System.out.println(pageBean);

        return map;
    }
    @RequestMapping("/queryjkListPager")
    @CrossOrigin
    @ResponseBody
    public Map<Object, Object> queryjkListPager(PageBean pageBean) {
        Map<Object, Object> map = null;
        try {
            map = new HashMap<Object, Object>();
            if (null != pageBean && pageBean.isPagination()) {
                //第一个参数:当前页码
                //第二个参数:每页显示行数
                PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
            }
            System.out.println(pageBean);
            List<Paymentschedule> records=new ArrayList<Paymentschedule>();
            List<Paymentschedule> record1 = paymentscheduleService.queryjkListPager1(pageBean);
            List<Paymentschedule> record2 = paymentscheduleService.queryjkListPager2(pageBean);
            List<Paymentschedule> record3 = paymentscheduleService.queryjkListPager3(pageBean);
            if(record3!=null ){
                for (Paymentschedule paymentschedule : record3) {
                    records.add(paymentschedule);
                }
            }

            if(record2!=null){
                for (Paymentschedule paymentschedule : record2) {
                    if(paymentschedule!=null){
                        records.add(paymentschedule);
                    }
                }
            }

            if(record1!=null){
                for (Paymentschedule paymentschedule : record1) {
                    records.add(paymentschedule);
                }
            }

            map.put("records", records);
            if (null != pageBean && pageBean.isPagination()) {
                PageInfo pageInfo = new PageInfo(records);
                System.out.println("页码：" + pageInfo.getPageNum());
                System.out.println("页大小：" + pageInfo.getPageSize());
                System.out.println("总记录：" + pageInfo.getTotal());
                pageBean.setTotal((int) pageInfo.getTotal());
                pageBean.setTotal(pageInfo.getTotal() + "");
            }
            map.put("pageBean", pageBean);


            System.out.println(pageBean);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return map;
    }

}
