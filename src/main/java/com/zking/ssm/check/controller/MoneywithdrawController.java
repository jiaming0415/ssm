package com.zking.ssm.check.controller;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.check.model.Moneywithdraw;
import com.zking.ssm.check.service.IMoneywithdrawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/moneywithdraw")
public class MoneywithdrawController {
    @Autowired
    private IMoneywithdrawService moneywithdrawService;

    @RequestMapping("/queryMoneywithdrawPager")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> queryMoneywithdrawPager(Moneywithdraw moneywithdraw, HttpServletRequest request){
        System.out.println(moneywithdraw);
        Map<String,Object> map=new HashMap<>();
        PageBean pageBean=new PageBean();
        pageBean.setRequest(request);
        List<Map> list = moneywithdrawService.queryMoneywithdrawPager(moneywithdraw, pageBean);
        map.put("list",list);
        map.put("total",pageBean.getTotal());
        return map;
    }

    @RequestMapping("/updateState")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> updateState(Moneywithdraw moneywithdraw){
        Map<String,Object> map = new HashMap<>();
        moneywithdraw.setAudittime(new Timestamp(new Date().getTime()));
        int n = moneywithdrawService.updateState(moneywithdraw);
        if (n>0){
            map.put("ok",true);
        }else {
            map.put("no",false);
        }
        return map;
    }

    @RequestMapping("/insertSelective")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> insertSelective(Moneywithdraw moneywithdraw){
        Map<String,Object> map = null;
        try {
            map = new HashMap<>();
            moneywithdraw.setApplytime(new Timestamp(new Date().getTime()));
            int n = moneywithdrawService.insertSelective(moneywithdraw);
            if (n>0){
                map.put("ok",true);
            }else {
                map.put("no",false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
