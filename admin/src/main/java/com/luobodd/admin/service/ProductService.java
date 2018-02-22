package com.luobodd.admin.service;

import com.luobodd.common.po.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {
    public List<Map<String,Object>> productList();
    public int addProduct(Product product);
    public Product queryProduct(Integer productId);
    /**
     * 根据id修改商品
     * @param product
     * @return
     */
    public int editProduct(Product product);

    /**
     * 查询商品当前状态
     * @param productId
     * @return
     */
    public int querystartProduct(Integer productId);

    /**
     * 上架商品
     * @param productId
     * @return
     */
    public int startProduct(Integer productId);

    /**
     * 下架商品
     * @param productId
     * @return
     */
    public int stopProduct(Integer productId);
}
