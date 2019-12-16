package com.zking.ssm.system.controller;

import com.zking.ssm.system.model.Systemdictionaryitem;
import com.zking.ssm.system.service.ISystemdictionaryitemService;
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
@RequestMapping("/systemdictionaryitem")
public class SystemdictionaryitemController {
    @Autowired
    private ISystemdictionaryitemService systemdictionaryitemService;

    @RequestMapping("/queryListByParentid")
    @ResponseBody
    @CrossOrigin
    public List<Systemdictionaryitem> queryListByParentid(String parentid){
        System.out.println(parentid);
        List<Systemdictionaryitem> list = systemdictionaryitemService.selectByParentid(Long.valueOf(parentid));
        return list;
    };
    @RequestMapping("/updateSystemdictionaryitem")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> updateSystemdictionaryitem(Systemdictionaryitem systemdictionaryitem){
        Map<String,Object> map=new HashMap<>();
        int i = systemdictionaryitemService.updateByPrimaryKeySelective(systemdictionaryitem);
        if(i>0){
            map.put("msg",true);
        }else {
            map.put("msg",false);
        }
        return map;
    };
    @RequestMapping("/addSystemdictionaryitem")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> addSystemdictionaryitem(Systemdictionaryitem systemdictionaryitem){
        System.out.println(systemdictionaryitem);
        Map<String,Object> map=new HashMap<>();
        int i = systemdictionaryitemService.insertSelective(systemdictionaryitem);
        if(i>0){
            map.put("msg",true);
        }else {
            map.put("msg",false);
        }
        return map;
    };
    @RequestMapping("/delSystemdictionaryitem")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> delSystemdictionaryitem(Long id){
        System.out.println(id);
        Map<String,Object> map=new HashMap<>();
        int i = systemdictionaryitemService.deleteByPrimaryKey(id);
        if(i>0){
            map.put("msg",true);
        }else {
            map.put("msg",false);
        }
        return map;
    };
    @RequestMapping("/query")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> query(){
        Map<String,Object> map=new HashMap<>();
        List<Systemdictionaryitem> data1= new ArrayList<>();
        List<Systemdictionaryitem> data2= new ArrayList<>();
        List<Systemdictionaryitem> data3= new ArrayList<>();
        List<Systemdictionaryitem> data4= new ArrayList<>();
        List<Systemdictionaryitem> data5= new ArrayList<>();
        List<Systemdictionaryitem> data6= new ArrayList<>();
        List<Systemdictionaryitem> systemdictionaryitems = systemdictionaryitemService.queryAll();
        for (Systemdictionaryitem systemdictionaryitem : systemdictionaryitems) {
            if(systemdictionaryitem.getParentid()==6){
                data1.add(systemdictionaryitem);
            }
            if(systemdictionaryitem.getParentid()==5){
                data2.add(systemdictionaryitem);
            }
            if(systemdictionaryitem.getParentid()==4){
                data3.add(systemdictionaryitem);
            }
            if(systemdictionaryitem.getParentid()==3){
                data4.add(systemdictionaryitem);
            }
            if(systemdictionaryitem.getParentid()==2){
                data5.add(systemdictionaryitem);
            }
            if(systemdictionaryitem.getParentid()==7){
                data6.add(systemdictionaryitem);
            }
        }

        map.put("data1",data1);
        map.put("data2",data2);
        map.put("data3",data3);
        map.put("data4",data4);
        map.put("data5",data5);
        map.put("data6",data6);


        return map;
    }
}
