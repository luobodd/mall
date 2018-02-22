package com.luobodd.front.listener;

import com.alibaba.fastjson.JSON;
import com.luobodd.common.po.Category;
import com.luobodd.front.service.CategoryService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.List;

@WebListener
public class ContextLoaderListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        CategoryService categoryService = context.getBean(CategoryService.class);
        List<Category> categoryList = categoryService.categoryList();
        //5.将查询到的数据放入application作用域
        servletContext.setAttribute("categoryList",categoryList);
        System.out.println("JSON.toJSONString(categoryList) = " + JSON.toJSONString(categoryList));
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
