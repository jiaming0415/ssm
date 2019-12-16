package com.zking.ssm.system.controller;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.system.model.Role;
import com.zking.ssm.system.model.Systemdictionary;
import com.zking.ssm.system.service.IRoleService;
import com.zking.ssm.system.service.ISystemdictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private IRoleService roleService;

    @RequestMapping("/queryListPager")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> queryListPager(Role role, HttpServletRequest request){
        System.out.println(role);
        Map<String,Object> map=new HashMap<>();
        PageBean pageBean=new PageBean();
        pageBean.setRequest(request);
        System.out.println(pageBean);
        List<Role> list = roleService.selectListPager(role, pageBean);
        map.put("list",list);
        map.put("total",pageBean.getTotal());
        return map;
    };
    @RequestMapping("/insertRole")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> insertRole(Role role){
        role.setRoleid(UUID.randomUUID().toString().replace("-",""));
        System.out.println(role);
        Map<String,Object> map=new HashMap<>();
        int i = roleService.insertSelective(role);
        map.put("msg","新增成功");
        map.put("success",true);
        return map;
    };
    @RequestMapping("/editRole")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> editRole(Role role){
        System.out.println(role);
        Map<String,Object> map=new HashMap<>();
        int i = roleService.updateByPrimaryKeySelective(role);
        map.put("msg","修改成功");
        map.put("success",true);
        return map;
    };
    @RequestMapping("/delRole")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> delRole(String roleid){
        System.out.println(roleid);
        Map<String,Object> map=new HashMap<>();
        int i = roleService.deleteByPrimaryKey(roleid);
        map.put("msg","删除成功");
        map.put("success",true);
        return map;
    };


}
