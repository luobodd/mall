package com.hwua.admin.service.impl;

import com.hwua.admin.service.ProductService;
import com.hwua.common.dao.ProductMapper;
import com.hwua.common.po.Product;
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
    public List<Map<String, Object>> productList() {
        return productMapper.productList();
    }

    @Override
    public int addProduct(Product product) {
        return productMapper.addProduct(product);
    }
    public Product queryProduct(Integer productId){
        return productMapper.queryProduct(productId);
    }

    @Override
    public int editProduct(Product product) {
        return productMapper.editProduct(product);
    }

    @Override
    public int querystartProduct(Integer productId) {
        return productMapper.querystartProduct(productId);
    }

    @Override
    public int startProduct(Integer productId) {
        return productMapper.startProduct(productId);
    }

    @Override
    public int stopProduct(Integer productId) {
        return productMapper.stopProduct(productId);
    }
}
