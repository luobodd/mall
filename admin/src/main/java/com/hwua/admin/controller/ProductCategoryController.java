package com.hwua.admin.controller;

import com.alibaba.fastjson.JSON;
import com.hwua.admin.service.CategoryService;
import com.hwua.common.po.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/productCategory")
public class ProductCategoryController {
    @Autowired
    private CategoryService categoryService;
    @RequestMapping("/category")
    public String categoryList(Map<String,Object> map){
        List<Category> categoryList = categoryService.categoryList();
        System.out.println("categoryList = " + categoryList);
        map.put("categoryList",categoryList);
        map.put("categorySize",categoryList.size());
        return "product-category";
    }
    @RequestMapping("/categoryAdd")
    public String categoryAdd(String categoryName){
        categoryService.addCategory(categoryName);
        return "redirect:/productCategory/category";
    }
    @RequestMapping("editCategoryPage")
    public String editBrandPage(Integer categoryId,Map<String,Object> map){
        System.out.println("categoryId = " + categoryId);
        Category category = categoryService.queryCategory(categoryId);
        System.out.println("category = " + category);
        map.put("category",category);
        return "product-category-edit";
    }
    @RequestMapping("editCategory")
    public String editCategory(Integer categoryId,String categoryName,Category category){
        System.out.println("categoryId = [" + categoryId + "], categoryName = [" + categoryName + "], category = [" + category + "]");
        category.setCategoryId(categoryId);
        category.setCategoryName(categoryName);
        categoryService.editCategory(category);
        return "redirect:/productCategory/category";
    }
}
