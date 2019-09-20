package com.vip.index.domain.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Car {
    /**
    * 汽车id
    */
    private Integer carId;

    /**
    * 汽车名称
    */
    private String carName;

    /**
    * 汽车描述
    */
    private String carDescr;

    /**
    * 新车价
    */
    private Double prePrice;

    /**
    * 一口价
    */
    private Double relPrice;

    /**
    * 上牌时间
    */
    private Date carLicense;

    /**
    * 行驶里程
    */
    private String carMile;

    /**
    * 排量
    */
    private String carCapacity;

    /**
     * 销售量
     */
    private Integer sales;

    /**
     * 好评数
     */
    private Integer remarks;

    private Integer brandId;

    private Integer typeId;

    private Integer priceId;

    private Integer carageId;

    private Integer mileId;

    private Integer standardId;
}