package com.zking.ssm.user.controller;

import com.zking.ssm.base.util.HttpUtils;
import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.system.model.User;
import com.zking.ssm.system.service.ISystemdictionaryitemService;
import com.zking.ssm.user.model.Userinfo;
import com.zking.ssm.user.service.IUserinfoService;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/userinfo")
public class UserinfoController {
    @Autowired
    IUserinfoService iUserinfoService;

    @Autowired
    ISystemdictionaryitemService systemdictionaryitemService;

    @RequestMapping("/queryById")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> queryById(Long id){
        System.out.println("1222222");
        Map<String,Object> map=new HashMap<>();
        try {
            Userinfo userinfo = iUserinfoService.selectByPrimaryKey(id);
            System.out.println(userinfo);
            map.put("id",userinfo.getId());
            map.put("username",userinfo.getUsername());
            map.put("password",userinfo.getPassword());
            map.put("version",userinfo.getVersion());
            map.put("bitstate",userinfo.getBitstate());
            map.put("realname",userinfo.getRealname());
            map.put("score",userinfo.getScore());
            map.put("realauthid",userinfo.getRealauthid());
            map.put("idnumber",userinfo.getIdnumber());
            if (null == userinfo.getPhonenumber()||"".equals(userinfo.getPhonenumber())) {
                map.put("phonenumber","请编辑您的电话号码");
            }else {
                map.put("phonenumber",userinfo.getPhonenumber());
            }

            if (userinfo.getIncomegradeid() == null) {
                map.put("incomegradeid","请编辑您的收入");
            }else{
                map.put("incomegradeid",systemdictionaryitemService.selectByPrimaryKey(Float.valueOf(userinfo.getIncomegradeid()).longValue()).getTitle());
            }
            if (userinfo.getMarriageid() == null) {
                map.put("marriageid","请编辑您的婚姻状态");
            }else{
                map.put("marriageid",systemdictionaryitemService.selectByPrimaryKey((long)userinfo.getMarriageid()).getTitle());
            }

            if (userinfo.getKidcountid() == null) {
                map.put("kidcountid","请编辑您的子女情况");
            }else{
                map.put("kidcountid",systemdictionaryitemService.selectByPrimaryKey((long)userinfo.getKidcountid()).getTitle());
            }

            if (userinfo.getEducationbackgroundid() == null) {
                map.put("educationbackgroundid","请编辑您的教育背景");
            }else{
                map.put("educationbackgroundid",systemdictionaryitemService.selectByPrimaryKey((long)userinfo.getEducationbackgroundid()).getTitle());
            }
            if (userinfo.getHouseconditionid() == null) {
                map.put("houseconditionid","请编辑您的住房条件");
            }else{
                map.put("houseconditionid",systemdictionaryitemService.selectByPrimaryKey((long)userinfo.getHouseconditionid()).getTitle());
            }

            map.put("email",userinfo.getEmail());
            map.put("salt",userinfo.getSalt());
        }catch (Exception e){
            e.printStackTrace();
        }

        return map;
    }


    @RequestMapping("/update")
    @ResponseBody
    @CrossOrigin
    public int update(Userinfo userinfo){
        System.out.println("1234567890");
        return iUserinfoService.updateByPrimaryKeySelective(userinfo);
    }

    @RequestMapping("/selectOne")
    @ResponseBody
    @CrossOrigin
    public Userinfo selectOne(Long id){
        Userinfo userinfo = iUserinfoService.selectByPrimaryKey(id);
        return userinfo;
    }


    @RequestMapping("/queryListPager")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> queryListPager(Userinfo userinfo, HttpServletRequest request){
        System.out.println(userinfo);
        Map<String,Object> map=new HashMap<>();
        PageBean pageBean=new PageBean();
        pageBean.setRequest(request);
        System.out.println(pageBean);
        List<Userinfo> list = iUserinfoService.selectListPager(userinfo, pageBean);
        map.put("list",list);
        map.put("total",pageBean.getTotal());
        return map;
    };
    @RequestMapping("/insert")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> insert(Userinfo userinfo){
        System.out.println(userinfo);
        Map<String,Object> map=new HashMap<>();
        int i = iUserinfoService.insertSelective(userinfo);
        map.put("msg","新增成功");
        map.put("success",true);
        return map;
    };
    @RequestMapping("/edit")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> edit(Userinfo userinfo){
        System.out.println(userinfo);
        Map<String,Object> map=new HashMap<>();
        int i = iUserinfoService.updateByPrimaryKeySelective(userinfo);
        map.put("msg","修改成功");
        map.put("success",true);
        return map;
    };
    @RequestMapping("/del")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> del(String id){
        System.out.println(id);
        Map<String,Object> map=new HashMap<>();
        int i = iUserinfoService.deleteByPrimaryKey(id);
        map.put("msg","删除成功");
        map.put("success",true);
        return map;
    };

    @RequestMapping(value="/authentication",produces="application/json;charset=utf-8")
    @ResponseBody
    @CrossOrigin
    public Map<String,String> verification(Userinfo userinfo){
        String host = "https://fesms.market.alicloudapi.com";
        String path = "/sms/";
        String method = "GET";
        String appcode = "4a4ebff79bce42a29f1b50d3ede2c4e5";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("code", Math.round((Math.random()+1) * 1000)+"");
        querys.put("phone", userinfo.getPhonenumber());
        querys.put("skin", "1");
        querys.put("sign", "1");
        //JDK 1.8示例代码请在这里下载：  http://code.fegine.com/Tools.zip
        try {
            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 或者直接下载：
             * http://code.fegine.com/HttpUtils.zip
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             * 相关jar包（非pom）直接下载：
             * http://code.fegine.com/aliyun-jar.zip
             */
            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
            //System.out.println(response.toString());如不输出json, 请打开这行代码，打印调试头部状态码。
            //状态码: 200 正常；400 URL无效；401 appCode错误； 403 次数用完； 500 API网管错误
            //获取response的body
            // System.out.println(EntityUtils.toString(response.getEntity()));
            //return EntityUtils.toString(response.getEntity(),"UTF-8");
            return querys;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return querys;
    }

    @RequestMapping("/register")
    @ResponseBody
    @CrossOrigin
    public Long register(Userinfo userinfo){
        int i=0;

        i = iUserinfoService.register(userinfo);
        System.out.println(i);
        Long a = userinfo.getId();
        System.out.println(userinfo.getId());
        return a;
    }




    @RequestMapping("/login")
    @ResponseBody
    @CrossOrigin
    public Userinfo login(Userinfo userinfo){
        Userinfo login = iUserinfoService.login(userinfo);
        return login;
    }




}
