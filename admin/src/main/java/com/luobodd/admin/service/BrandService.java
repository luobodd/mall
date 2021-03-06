package com.luobodd.admin.service;

import com.luobodd.common.po.Brand;

import java.util.List;

public interface BrandService {
    public List<Brand> brandList();
    public int addBrand(String brandName);
    public Brand queryBrand(Integer brandId);
    public int editBrand(Brand brand);
}
