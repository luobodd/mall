package com.luobodd.common.dao;


import com.luobodd.common.po.Brand;

import java.util.List;

public interface BrandMapper {
    /**
     * 遍历出所有品牌
     * @return
     */
    public List<Brand> brandList();

    /**
     * 添加品牌
     * @param brandName
     * @return
     */
    public int addBrand(String brandName);

    /**
     * 根据brandId查询brand
     * @param brandId
     * @return
     */
    public Brand queryBrand(Integer brandId);

    /**
     * 根据id修改品牌的name
     * @param brand
     * @return
     */
    public int editBrand(Brand brand);
}
