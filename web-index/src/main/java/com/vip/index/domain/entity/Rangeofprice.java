package com.vip.index.domain.entity;

import lombok.Data;

@Data
public class Rangeofprice {
    /**
    * 价格范围id
    */
    private Integer priceId;

    /**
    * 价格范围
    */
    private String priceBetween;
}