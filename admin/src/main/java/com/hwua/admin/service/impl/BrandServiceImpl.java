package com.hwua.admin.service.impl;

import com.hwua.admin.service.BrandService;
import com.hwua.common.dao.BrandMapper;
import com.hwua.common.po.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@SuppressWarnings("SpringJavaAutowiringInspection")
@Service("brandService")
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;
    @Override
    public List<Brand> brandList() {
        return brandMapper.brandList();
    }

    @Override
    public int addBrand(String brandName) {
        return brandMapper.addBrand(brandName);
    }

    @Override
    public Brand queryBrand(Integer brandId) {
        return brandMapper.queryBrand(brandId);
    }

    @Override
    public int editBrand(Brand brand) {
        return brandMapper.editBrand(brand);
    }
}
