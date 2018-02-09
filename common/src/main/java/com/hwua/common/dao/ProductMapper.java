package com.hwua.common.dao;


import com.hwua.common.po.Product;

import java.util.List;
import java.util.Map;

public interface ProductMapper {
    /**
     * 分类查询商品信息
     * @param param
     * @return
     */
    public List<Map<String,Object>> productCategoryList(Map<String, Object> param);

    /**
     * 根据productId查询商品详情
     * @param productId
     * @return
     */
    public List<Map<String,Object>> productDetail(Integer productId);

    /**
     * 根据商品id查询商品价格
     * @param productId
     * @return
     */
    public Double queryProductPrice(Integer productId);

    /**
     * 根据商品名称模糊搜索商品
     * @param productName
     * @return
     */
    public List<Map<String,Object>> selectProduct(String productName);

    /**
     * 遍历所有商品
     * @return
     */
    public List<Map<String,Object>> productList();

    /**
     * 商品添加
     * @param product
     * @return
     */
    public int addProduct(Product product);

    /**
     * 根据id查询product
     * @param productId
     * @return
     */
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
