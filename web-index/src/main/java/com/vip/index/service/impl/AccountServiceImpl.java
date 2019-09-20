package com.vip.index.service.impl;

import com.vip.index.domain.entity.User;
import com.vip.index.mapper.UserMapper;
import com.vip.index.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    UserMapper userMapper;
    @Override
    public User getUser(String username,String password) {
        User user = userMapper.findByName(username);
        if(user == null){
            throw new RuntimeException("用户不存在");
        }else if ("".equals(password)){
            throw new RuntimeException("密码不能为空");
        }else if (!user.getPassword().equals(password)){
            throw new RuntimeException("密码错误,请重新输入");
        }
        return user;
    }

    @Override
    public int insertUser(User user) {
        User newUser = userMapper.findByName(user.getUsername());
        if("".equals(user.getUsername())){
            throw  new RuntimeException("用户名不能为空!");
        }
        else if(newUser!=null){
            throw  new RuntimeException("用户名已存在!");
        }else if (user.getPhone().length()!=11){
            throw  new RuntimeException("电话格式不对!");
        }

        return userMapper.saveUser(user);
    }
}
