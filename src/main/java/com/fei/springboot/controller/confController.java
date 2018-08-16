package com.fei.springboot.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fei.springboot.myConfig.MyProps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/config")
public class confController {

    @Autowired
    private MyProps myProps;

    @RequestMapping(value = "/deplay")
    public void deplay() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println("simpleProp: " + myProps.getSimpleProp());
        System.out.println("arrayProps: " + objectMapper.writeValueAsString(myProps.getArrayProps()));
        System.out.println("listProp1: " + objectMapper.writeValueAsString(myProps.getListProp1()));
        System.out.println("listProp2: " + objectMapper.writeValueAsString(myProps.getListProp2()));
        System.out.println("mapProps: " + objectMapper.writeValueAsString(myProps.getMapProps()));
    }

}
