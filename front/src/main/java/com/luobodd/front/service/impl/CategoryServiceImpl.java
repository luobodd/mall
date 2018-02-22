package com.luobodd.front.service.impl;

import com.luobodd.common.dao.CategoryMapper;
import com.luobodd.common.po.Category;
import com.luobodd.front.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@SuppressWarnings("SpringJavaAutowiringInspection")
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public List<Category> categoryList() {
        List<Category> categoryList = categoryMapper.categoryList();
        return categoryList;
    }
}
