package com.zking.ssm.system.controller;

import com.zking.ssm.system.model.Module;
import com.zking.ssm.system.model.UserRole;
import com.zking.ssm.system.service.IUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/userrole")
public class UserRoleController {
    @Autowired
    IUserRoleService userRoleService;

    @RequestMapping("/queryList")
    @ResponseBody
    @CrossOrigin
    public List<UserRole> queryList(UserRole userole){
        System.out.println(userole);
        List<UserRole> list = userRoleService.queryListByUseridAndRoleid(userole);
        for (UserRole ur : list) {
            System.out.println(ur);
        }
        return list;
    };

    @RequestMapping("/deleteList")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> deleteList(UserRole userole){
        System.out.println(userole);
        Map<String,Object> map=new HashMap<>();
        userRoleService.deleteByUseridAndRoleid(userole);
        map.put("msg","成功");
        return map;
    };
    @RequestMapping("/insert")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> insert(UserRole userole){
        System.out.println(userole);
        Map<String,Object> map=new HashMap<>();
        userRoleService.insertSelective(userole);
        map.put("msg","成功");
        return map;
    };
}
