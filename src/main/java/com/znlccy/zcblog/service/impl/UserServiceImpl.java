package com.znlccy.zcblog.service.impl;

import com.znlccy.zcblog.domain.User;
import com.znlccy.zcblog.mapper.UserMapper;
import com.znlccy.zcblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author: znlccy
 * version: 1.0.0
 * date: 12/19/18-4:45 AM
 * comment: 用户服务实现类
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int saveUser(User user) {
        return userMapper.saveUser(user);
    }
}
