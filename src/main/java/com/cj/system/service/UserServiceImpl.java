package com.cj.system.service;

import com.cj.system.dao.UserMapper;
import com.cj.system.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Liujialin
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByName(String username) {
        return userMapper.selectByName(username);
    }
}