package com.vip.index.service.impl;

import com.vip.index.common.HeadBean;
import com.vip.index.domain.entity.Car;
import com.vip.index.mapper.BrandMapper;
import com.vip.index.mapper.CarMapper;
import com.vip.index.mapper.RangeofpriceMapper;
import com.vip.index.mapper.TypeMapper;
import com.vip.index.service.IndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {

    @Resource
    BrandMapper brandMapper;
    @Resource
    RangeofpriceMapper rangeofpriceMapper;
    @Resource
    TypeMapper typeMapper;
    @Resource
    CarMapper carMapper;
    @Override
    public HeadBean getHead() {
        HeadBean headBean = new HeadBean();
        headBean.setBrands(brandMapper.findAll());
        headBean.setRangeofprices(rangeofpriceMapper.findAll());
        headBean.setTypeVos(typeMapper.findAll());
        return headBean;
    }

    /**
     * 通过品牌和车型查询车辆
     * @param name
     * @return
     */
    @Override
    public List<Car> getCars(String name) {
        return carMapper.findByName(name);
    }

    /**
     * 通过销售量排序
     * @return
     */
    @Override
    public List<Car> getCarsOrderBySales() {
        return carMapper.findOrderBySales();
    }

    /**
     * 通过上牌时间排序
     * @return
     */
    @Override
    public List<Car> getCarsOrderByLicense() {
        return carMapper.findOrderByCarLicense();
    }

    /**
     * 通过好评数排序
     * @return
     */
    @Override
    public List<Car> getCarsOrderByRemarks() {
        return carMapper.findOrderByRemarks();
    }
}
