package com.fei.springboot.dao;

import com.fei.springboot.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> query();
    public int update(User user);
}
