package com.hwua.front.controller;

import com.hwua.front.service.CategoryService;
import com.hwua.common.po.Category;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @RequestMapping(value = "/index",produces = "application/json;charset=utf-8")
    @ResponseBody
    public ModelAndView categoryList(Application application){
        ModelAndView modelAndView = new ModelAndView("index");
        List<Category> categoryList = categoryService.categoryList();
//        application.
        return modelAndView;
    }
}
