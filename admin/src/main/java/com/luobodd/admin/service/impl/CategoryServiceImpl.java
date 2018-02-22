package com.luobodd.admin.service.impl;

import com.luobodd.admin.service.CategoryService;
import com.luobodd.common.dao.CategoryMapper;
import com.luobodd.common.po.Category;
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
        return categoryMapper.categoryList();
    }

    @Override
    public int addCategory(String categoryName) {
        return categoryMapper.addCategory(categoryName);
    }

    @Override
    public Category queryCategory(Integer categoryId) {
        return categoryMapper.queryCategory(categoryId);
    }

    @Override
    public int editCategory(Category category) {
        return categoryMapper.editCategory(category);
    }
}
