package com.antsoft.controller;

import com.antsoft.model.User;
import com.antsoft.service.UserService;
import com.github.pagehelper.PageInfo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@ComponentScan({"com.antsoft.service"})
@MapperScan("com.antsoft.mapper") //mapper的包
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all")
    public String getALL(){
        List<User> userList = userService.getAll();
        return userList.toString();
    }

    @RequestMapping(value = "/update")
    public int update(){
        User user = new User();
        user.setId(1);
        user.setAge(30);
        user.setUsername("xym");
        user.setPassword("xym");
        int num = userService.update(user);
        return num;
    }


}
