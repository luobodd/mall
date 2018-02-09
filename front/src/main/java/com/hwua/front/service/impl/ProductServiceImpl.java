package com.hwua.front.service.impl;

import com.hwua.common.dao.ProductMapper;
import com.hwua.common.po.Product;
import com.hwua.front.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Service("productService")
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<Map<String,Object>> productCategoryList(Map<String, Object> param) {
        return productMapper.productCategoryList(param);
    }

    @Override
    public List<Map<String,Object>> productDetail(Integer productId) {
        return productMapper.productDetail(productId);
    }

    @Override
    public Double queryProductPrice(Integer productId) {
        return productMapper.queryProductPrice(productId);
    }

    @Override
    public List<Map<String,Object>> selectProduct(String productName) {
        return productMapper.selectProduct(productName);
    }
}
