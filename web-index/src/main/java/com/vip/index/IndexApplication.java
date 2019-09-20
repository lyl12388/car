package com.vip.index;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.vip.index.mapper")
@SpringBootApplication
public class IndexApplication {

    public static void main(String[] args) {
        SpringApplication.run(IndexApplication.class, args);
    }

}
