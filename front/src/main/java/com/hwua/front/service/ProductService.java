package com.hwua.front.service;


import com.hwua.common.po.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {
    public List<Map<String,Object>> productCategoryList(Map<String,Object> param);
    public List<Map<String,Object>> productDetail(Integer productId);
    public Double queryProductPrice(Integer productId);
    public List<Map<String,Object>> selectProduct(String productName);
}
