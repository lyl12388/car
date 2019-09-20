package com.vip.index.domain.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class User {
    /**
    * 用户id
    */
    @JSONField(serialize = false)
    private Integer uid;

    /**
    * 用户名
    */
    private String username;

    /**
    * 用户密码
    */
    @JSONField(deserialize = false)
    private String password;

    /**
    * 性别
    */
    private String sex;

    /**
    * 电话
    */
    private String phone;

    /**
    * 0代表未注销,1代表已注销
    */
    private Byte isDelete;
}