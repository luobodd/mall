package com.hwua.common.dao;


import com.hwua.common.po.Category;

import java.util.List;

public interface CategoryMapper {
    /**
     * 遍历出所有分类
     * @return
     */
    public List<Category> categoryList();

    /**
     * 添加分类
     * @param categoryName
     * @return
     */
    public int addCategory(String categoryName);

    /**
     * 根据id查询分类
     * @param categoryId
     * @return
     */
    public Category queryCategory(Integer categoryId);
    /**
     * 根据id修改分类的name
     * @param category
     * @return
     */
    public int editCategory(Category category);
}
