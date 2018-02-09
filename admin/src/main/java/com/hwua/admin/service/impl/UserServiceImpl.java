package com.hwua.admin.service.impl;

import com.hwua.admin.service.UserService;
import com.hwua.common.dao.UserMapper;
import com.hwua.common.po.User;
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
