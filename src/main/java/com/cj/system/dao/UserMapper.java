package com.cj.system.dao;

import com.cj.system.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    User selectByName(String username);

    List<User> selectUser();
}
