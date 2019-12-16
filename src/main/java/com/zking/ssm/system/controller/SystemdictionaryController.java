package com.zking.ssm.system.controller;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.system.model.Systemdictionary;
import com.zking.ssm.system.service.ISystemdictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/systemdictionary")
public class SystemdictionaryController {
    @Autowired
    private ISystemdictionaryService systemdictionaryService;

    @RequestMapping("/queryListPager")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> queryListPager(Systemdictionary systemdictionary, HttpServletRequest request){
        Map<String,Object> map=new HashMap<>();
        PageBean pageBean=new PageBean();
        pageBean.setRequest(request);
        List<Systemdictionary> list = systemdictionaryService.selectListPager(systemdictionary, pageBean);
        map.put("list",list);
        map.put("total",pageBean.getTotal());
        return map;
    };

}
