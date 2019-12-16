package com.zking.ssm.book.controller;

import com.zking.ssm.book.model.Book;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Locale;
import java.util.Map;

@Controller
public class IndexController {
    //示例一: @RequestMapping作用在方法上
    //示例二: @RequestMapping作用在类上
    //示例三：@RequestMapping之method请求方式POST+GET
    //示例四：接收请求参数：@RequestParam,String,对象，HttpServletRequest以及Map
    //示例五：返回结果
    //1）返回逻辑视图名，用于页面跳转
    //2）ModelAndView
    //3）Model
    //示例六：页面跳转
    //1）"forward:path"      转发
    //2)"redirect:path"     重定向
    //注：使用以上方式会绕开视图解析器，适用于Controller之间的跳转，最终还是会走视图解析器到页面

 /*   @RequestMapping(value = "/")
    public String toIndex(@RequestParam String sex,
                          Book book,
                          HttpServletRequest request,
                          @RequestParam Map<String,Object> params,
                          Model model){
        System.out.println("index");
        System.out.println(sex);
        System.out.println(book);
        System.out.println(request);
        System.out.println(params);


       *//* ModelAndView mv=new ModelAndView();
        mv.setViewName("index");
        mv.addObject("book",book);
         return mv;*//*
       model.addAttribute("book",book);
//        return "redirect:toHome";
        return "forward:toHome";
    }*/


    @RequestMapping("/toHome")
    public  String toHome(){
        System.out.println("toHome");
        return "index";
    }


    @RequestMapping("/home/index.shtml")
    public  String toWelcome(){
        System.out.println("welcome");
        return "index";
    }

    @RequestMapping("/changeLocalex")
    public String changeLocalex(HttpSession session, @RequestParam String locale){
        if("en".equals(locale))
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.US);
        else
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.CHINA);
        return "index";
    };
;


}
