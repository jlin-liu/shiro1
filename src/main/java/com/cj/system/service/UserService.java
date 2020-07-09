package com.cj.system.service;

import com.cj.system.entity.User;

public interface UserService {

    User selectByName(String username);
}
