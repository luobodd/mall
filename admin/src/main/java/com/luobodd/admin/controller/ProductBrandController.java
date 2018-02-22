package com.luobodd.admin.controller;

import com.luobodd.admin.service.BrandService;
import com.luobodd.common.po.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/ProductBrand")
public class ProductBrandController {
    @Autowired
    private BrandService brandService;
    @RequestMapping("/Brand")
    public String brandList(Map<String,Object> map){
        List<Brand> brandList = brandService.brandList();
        System.out.println("brandList = " + brandList);
        map.put("brandList",brandList);
        map.put("brandListSize",brandList.size());
        return "product-brand";
    }
    @RequestMapping("/addBrand")
    public String addBrand(String brandName){
        System.out.println("brandName = " + brandName);
        int i = brandService.addBrand(brandName);
        return "redirect:/ProductBrand/Brand";
        }
    @RequestMapping("editBrandPage")
    public String editBrandPage(Integer brandId,Map<String,Object> map){
        System.out.println("brandId = " + brandId);
        Brand brand = brandService.queryBrand(brandId);
        System.out.println("brand = " + brand);
        map.put("brand",brand);
        return "product-brand-edit";
    }
    @RequestMapping("editBrand")
    public String editBrand(Integer brandId,String brandName,Brand brand){
        System.out.println("brandId = [" + brandId + "], brandName = [" + brandName + "]");
        brand.setBrandId(brandId);
        brand.setBrandName(brandName);
        brandService.editBrand(brand);
        return "redirect:/ProductBrand/Brand";
    }
}
