package com.hwua.front.service.impl;

import com.hwua.common.dao.BrandMapper;
import com.hwua.common.po.Brand;
import com.hwua.front.service.BrandService;
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
