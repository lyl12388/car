package com.vip.index.mapper;

import com.vip.index.domain.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User findByName(@Param("username") String username);
    int saveUser(@Param("user") User user);
}