package com.vip.index.controller;

import com.vip.index.common.HeadBean;
import com.vip.index.domain.entity.Car;
import com.vip.index.service.IndexService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class IndexController {

    @Resource
    IndexService indexService;
    @RequestMapping("/heads")
    public HeadBean getHead(){
        return indexService.getHead();
    }
    @RequestMapping("/search")
    public List<Car> getCars(String name){
       return indexService.getCars(name);
    }
    @RequestMapping("/order1")
    public List<Car> getCarsOrder1(){
        return indexService.getCarsOrderBySales();
    }
    @RequestMapping("/order2")
    public List<Car> getCarsOrder2(){
        return indexService.getCarsOrderByLicense();
    }
    @RequestMapping("/order3")
    public List<Car> getCarsOrder3(){
        return indexService.getCarsOrderByRemarks();
    }
}
