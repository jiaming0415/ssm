package com.zking.ssm.system.controller;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.system.model.Module;
import com.zking.ssm.system.model.Role;
import com.zking.ssm.system.model.User;
import com.zking.ssm.system.service.IModuleService;
import com.zking.ssm.system.service.IRoleService;
import com.zking.ssm.system.service.IUserService;
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
import java.util.UUID;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;
    @Autowired
    private IModuleService moduleService;

    @RequestMapping("/queryListPager")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> queryListPager(User user, HttpServletRequest request){
        System.out.println(user);
        Map<String,Object> map=new HashMap<>();
        PageBean pageBean=new PageBean();
        pageBean.setRequest(request);
        System.out.println(pageBean);
        List<User> list = userService.selectListPager(user, pageBean);
        map.put("list",list);
        map.put("total",pageBean.getTotal());
        return map;
    };
    @RequestMapping("/insertUser")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> insert(User user){
        user.setId(UUID.randomUUID().toString().replace("-",""));
        System.out.println(user);
        Map<String,Object> map=new HashMap<>();
        int i = userService.insertSelective(user);
        map.put("msg","新增成功");
        map.put("success",true);
        return map;
    };
    @RequestMapping("/editUser")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> edit(User user){
        System.out.println(user);
        Map<String,Object> map=new HashMap<>();
        int i = userService.updateByPrimaryKeySelective(user);
        map.put("msg","修改成功");
        map.put("success",true);
        return map;
    };
    @RequestMapping("/delUser")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> del(String id){
        System.out.println(id);
        Map<String,Object> map=new HashMap<>();
        int i = userService.deleteByPrimaryKey(id);
        map.put("msg","删除成功");
        map.put("success",true);
        return map;
    };

    @RequestMapping("/userlogin")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> userlogin(User user,HttpServletResponse response){
        Map<String,Object> map= new HashMap<>();
        try {
            System.out.println(user);
            User userlogin = userService.userlogin(user);
            if(userlogin!=null){
                //获取到用户所拥有的权限路径
                List<Module> modules = userService.selectModuleByUserid(userlogin);
                map.put("modules",modules);
                List<Module> publicmodules = moduleService.selectByPid("99");
                map.put("publicmodules",publicmodules);
            }
            map.put("user",userlogin);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    };


}
