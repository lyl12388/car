package com.vip.index.common;

import com.vip.index.domain.entity.Brand;
import com.vip.index.domain.entity.Rangeofprice;
import com.vip.index.domain.vo.TypeVo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class HeadBean implements Serializable {
    private List<Brand> brands;
    private List<TypeVo> typeVos;
    private List<Rangeofprice> rangeofprices;
}
