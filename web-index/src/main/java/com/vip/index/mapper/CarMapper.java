package com.vip.index.mapper;

import com.vip.index.domain.entity.Car;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lyl
 */
public interface CarMapper {
    List<Car> findByName(@Param("name") String name);
    List<Car> findOrderBySales();
    List<Car> findOrderByCarLicense();
    List<Car> findOrderByRemarks();
}