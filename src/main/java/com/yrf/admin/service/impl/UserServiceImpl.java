package com.yrf.admin.service.impl;

import com.yrf.admin.bean.User;
import com.yrf.admin.mapper.UserMapper;
import com.yrf.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author YuRuoFan
 * @Date 2022-03-28 20:46
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(long id) {
        return userMapper.getUser(id);
    }
}
