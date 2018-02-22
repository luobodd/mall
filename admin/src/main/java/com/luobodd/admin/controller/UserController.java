package com.luobodd.admin.controller;

import com.luobodd.admin.service.UserService;
import com.luobodd.common.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String loginMember(HttpServletRequest request,String userName, String userPassword, User user, HttpSession session) {
        System.out.println("userName = [" + userName + "], userPassword = [" + userPassword + "], user = [" + user + "], session = [" + session + "]");
        int i = userService.login(user);
        System.out.println("i = " + i);
        if (i > 0) {
            System.out.println("登录成功");
            session.setAttribute("user", user);
            session.setAttribute("userName", userName);
            session.setAttribute("userPassword", userPassword);
            return "redirect:/";
        } else {
            System.out.println("登录失败");
            return "redirect:/500.jsp";
        }
    }
    @RequestMapping("logOff")
    public String logOff(HttpSession session){
        session.invalidate();
        return "redirect:/login.jsp";
    }
}
