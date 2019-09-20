package com.vip.index.domain.vo;

import com.vip.index.domain.entity.Car;
import com.vip.index.domain.entity.Type;
import lombok.Data;

import java.util.List;

@Data
public class TypeVo extends Type {
    private List<Car> cars;
}
