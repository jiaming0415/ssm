package com.zking.ssm.system.controller;

import com.zking.ssm.system.model.RoleModule;
import com.zking.ssm.system.model.UserRole;
import com.zking.ssm.system.service.IRoleModuleService;
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
@RequestMapping("/rolemodule")
public class RoleModuleController {

    @Autowired
    IRoleModuleService roleModuleService;

    @RequestMapping("/queryList")
    @ResponseBody
    @CrossOrigin
    public List<RoleModule> queryList(RoleModule roleModule){
        System.out.println(roleModule);
        List<RoleModule> list = roleModuleService.queryListByModuleidAndRoleid(roleModule);
        for (RoleModule ur : list) {
            System.out.println(ur);
        }
        return list;
    };

    @RequestMapping("/deleteList")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> deleteList(RoleModule roleModule){
        System.out.println(roleModule);
        Map<String,Object> map=new HashMap<>();
        roleModuleService.deleteByModuleidAndRoleid(roleModule);
        map.put("msg","成功");
        return map;
    };
    @RequestMapping("/insert")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> insert(RoleModule roleModule){
        System.out.println(roleModule);
        Map<String,Object> map=new HashMap<>();
        roleModuleService.insertSelective(roleModule);
        map.put("msg","成功");
        return map;
    };
}
