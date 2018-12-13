package com.google.service.impl;

import com.google.domain.User;
import com.google.mapper.UserMapper;
import com.google.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//该类由spring接手
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User queryUserById(Long id) {

        User user = userMapper.queryUserById(id);
        return user;

    }

    @Override
    public void deleteUserById(Long id) {
        userMapper.deleteUserById(id);
    }
}
