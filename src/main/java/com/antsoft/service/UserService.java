package com.antsoft.service;

import com.antsoft.aop.ReadOnlyConnection;
import com.antsoft.mapper.UserMapper;
import com.antsoft.model.User;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @ReadOnlyConnection
    public List<User> query(){
        return userMapper.query();
    }

    public int update(User user){
        return userMapper.update(user);
    }

}
