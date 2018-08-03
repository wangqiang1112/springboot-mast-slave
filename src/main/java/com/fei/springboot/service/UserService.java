package com.fei.springboot.service;

import com.fei.springboot.annotation.ReadDataSource;
import com.fei.springboot.annotation.WriteDataSource;
import com.fei.springboot.dao.UserMapper;
import com.fei.springboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @ReadDataSource
    public List<User> query(){
        return userMapper.query();
    }
    @WriteDataSource
    public int update(User user){
        return userMapper.update(user);
    }

}
