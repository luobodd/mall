package com.luobodd.front.controller;

import com.alibaba.fastjson.JSON;
import com.luobodd.common.po.Brand;
import com.luobodd.common.po.Category;
import com.luobodd.front.service.BrandService;
import com.luobodd.front.service.CategoryService;
import com.luobodd.front.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private BrandService brandService;
    @RequestMapping(value = "/productCategoryList",produces = "application/json;charset=utf-8")
    public String productCategoryList(Integer categoryId, Integer brandId,HttpServletRequest request){
        System.out.println("categoryId = [" + categoryId + "], brandId = [" + brandId + "], request = [" + request + "]");
        HashMap<String, Object> param = new HashMap<>();
//        param.put("start",(page -  1) * 5);
        param.put("categoryId",categoryId);
        param.put("brandId",brandId);
        List<Map<String,Object>> productList = productService.productCategoryList(param);
        String s = JSON.toJSONString(productList);
        System.out.println("s = " + s);
        request.setAttribute("productList",productList);
        List<Category> categoryList = categoryService.categoryList();
        System.out.println("categoryList = " + categoryList);
        request.setAttribute("categoryList",categoryList);
        List<Brand> brandList = brandService.brandList();
        request.setAttribute("brandList",brandList);
        System.out.println("brandList = " + brandList);
        return "products";
    }
    @RequestMapping(value = "/products",produces = "application/json;charset=utf-8")
    public String productDetail(Integer productId,HttpServletRequest request){
        List<Map<String,Object>> products = productService.productDetail(productId);
        request.setAttribute("products",products);
        return "product-detail";
    }
    @RequestMapping("/selectProduct")
    public String selectProduct(String productName,HttpServletRequest request){
        System.out.println("productName = " + productName);
        List<Map<String,Object>> productList = productService.selectProduct(productName);
        System.out.println("productList = " + productList);
        request.setAttribute("productList",productList);
        List<Category> categoryList = categoryService.categoryList();
        System.out.println("categoryList = " + categoryList);
        request.setAttribute("categoryList",categoryList);
        List<Brand> brandList = brandService.brandList();
        request.setAttribute("brandList",brandList);
        System.out.println("brandList = " + brandList);
        return "products";

    }
}
