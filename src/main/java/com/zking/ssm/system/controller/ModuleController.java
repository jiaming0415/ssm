package com.zking.ssm.system.controller;

import com.zking.ssm.system.model.Module;
import com.zking.ssm.system.service.IModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/module")
public class ModuleController {

    @Autowired
    private IModuleService moduleService;

    @RequestMapping("/queryListByPid")
    @ResponseBody
    @CrossOrigin
    public List<Module> queryListByPid(String pid){
        System.out.println(pid);
        List<Module> list = moduleService.selectByPid(pid);
        for (Module module : list) {
            System.out.println(module);
        }
        return list;
    };


}
