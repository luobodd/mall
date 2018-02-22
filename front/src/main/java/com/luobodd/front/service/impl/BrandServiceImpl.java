package com.luobodd.front.service.impl;

import com.luobodd.common.dao.BrandMapper;
import com.luobodd.common.po.Brand;
import com.luobodd.front.service.BrandService;
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
}
