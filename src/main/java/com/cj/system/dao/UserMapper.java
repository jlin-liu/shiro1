package com.cj.system.dao;

import com.cj.system.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User selectByName(String username);
}
