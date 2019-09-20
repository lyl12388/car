package com.vip.index.service;

import com.vip.index.common.HeadBean;
import com.vip.index.domain.entity.Car;

import java.util.List;

public interface IndexService {
    HeadBean getHead();
    List<Car> getCars(String name);
    List<Car> getCarsOrderBySales();
    List<Car> getCarsOrderByLicense();
    List<Car> getCarsOrderByRemarks();
}
