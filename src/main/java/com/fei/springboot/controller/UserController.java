package com.fei.springboot.controller;

import com.fei.springboot.domain.User;
import com.fei.springboot.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@ComponentScan({"com.fei.springboot.service"})
@MapperScan("com.fei.springboot.dao") //mapper的包
@RequestMapping("/aaa")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/queryMS")
    @ResponseBody
    public String queryMS(){
        List<User> userList = userService.query();
        return userList.toString();
    }

    @RequestMapping(value = "/updateMS")
    @ResponseBody
    public int update(){
        User user = new User();
        user.setId(1);
        user.setAge(30);
        user.setUsername("xym111");
        user.setPassword("xym111");
        int num = userService.update(user);
        return num;
    }


}
