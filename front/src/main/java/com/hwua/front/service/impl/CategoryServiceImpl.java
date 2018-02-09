package com.hwua.front.service.impl;

import com.hwua.common.dao.CategoryMapper;
import com.hwua.common.po.Category;
import com.hwua.front.service.CategoryService;
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
