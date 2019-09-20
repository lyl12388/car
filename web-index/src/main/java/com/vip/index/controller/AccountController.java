package com.vip.index.controller;

import com.vip.index.domain.entity.User;
import com.vip.index.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Resource
    AccountService accountService;
    @RequestMapping("/login")
    public User login(String username, String password,HttpServletRequest request){
        User user = accountService.getUser(username, password);
        request.getSession().setAttribute("username",user.getUsername());
        return user;
    }

    @RequestMapping("/register")
    public int register(User user){
        return accountService.insertUser(user);
    }
}
