package com.luobodd.admin.service;

import com.luobodd.common.po.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> categoryList();
    public int addCategory(String categoryName);
    public Category queryCategory(Integer categoryId);
    public int editCategory(Category category);
}
