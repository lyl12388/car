package com.vip.index.service;

import com.vip.index.domain.entity.User;

public interface AccountService {
    User getUser(String username,String password);
    int insertUser(User user);
}
