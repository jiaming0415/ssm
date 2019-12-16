package com.zking.ssm.borrowing.controller;

import com.zking.ssm.borrowing.model.Account;
import com.zking.ssm.borrowing.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private IAccountService accountService;
    @RequestMapping("/selectByPrimaryKey")
    @CrossOrigin
    @ResponseBody
    public Account selectByPrimaryKey(Integer id){
        return  accountService.selectByPrimaryKey(id);
    }
    @RequestMapping("/updateByPrimaryKey")
    @CrossOrigin
    @ResponseBody
    public  int updateByPrimaryKey(Account record){
        Account a= accountService.selectByPrimaryKey(record.getLogininfoid());
        a.setUsableamount(a.getUsableamount()-record.getUsableamount());
        return accountService.updateByPrimaryKey(a);
    }
    @RequestMapping("/updateByPrimaryKey1")
    @CrossOrigin
    @ResponseBody
    public  int updateByPrimaryKey1(Account record){
        Account a= accountService.selectByPrimaryKey(record.getLogininfoid());
        a.setUsableamount(a.getUsableamount()+record.getUsableamount());
        return accountService.updateByPrimaryKey(a);

    }

    @RequestMapping("/addAccount")
    @CrossOrigin
    @ResponseBody
    public int addAccount(Account account){
        int i = 0;
        try {
            i = accountService.insert(account);
        }catch (Exception e){
            e.printStackTrace();
        }
        return i;
    }



    @RequestMapping("/updateByLoginfoid")
    @ResponseBody
    @CrossOrigin
    public int updateByLoginfoid(Account account){
        int i = accountService.updateByLoginfoid(account);
        return i;
    }

    @RequestMapping("/selectByLoginfoid")
    @ResponseBody
    @CrossOrigin
    public Account selectByLoginfoid(Integer logininfoid){

        Account account =  accountService.selectByLoginfoid(logininfoid);
        return account;
    }
}
