package com.hwua.front.controller;

import com.hwua.front.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class IndexController {
    @Autowired
    private CategoryService categoryService;
    @RequestMapping(value = "/index",produces = "application/json;charset=utf-8")
    public String index(Map<String,Object> map){
//        Set<Category> categoryList = categoryService.categoryList();
//        map.put("specialProducts",categoryList);
        return "index";
    }
}
