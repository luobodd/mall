package com.luobodd.admin.service.impl;

import com.luobodd.admin.service.UserService;
import com.luobodd.common.dao.UserMapper;
import com.luobodd.common.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int login(User user) {
        return userMapper.login(user);
    }
}
