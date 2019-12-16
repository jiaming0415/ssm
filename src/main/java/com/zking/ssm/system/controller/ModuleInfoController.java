package com.zking.ssm.system.controller;

import com.zking.ssm.system.model.Module;
import com.zking.ssm.system.model.ModuleInfo;
import com.zking.ssm.system.service.IModuleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/moduleinfo")
public class ModuleInfoController {
    @Autowired
    private IModuleInfoService moduleInfoService;

    @RequestMapping("/queryAll")
    @ResponseBody
    @CrossOrigin
    public List<ModuleInfo> queryAll(String pid){
        List<ModuleInfo> list = moduleInfoService.queryModuleInfoByPid(pid);
        return list;
    };





}
