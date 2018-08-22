package com.fei.springboot.controller;


import com.fei.springboot.interfaceList.BeanInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/interfaceList")
public class InterfaceController {


    @Autowired
    private List<BeanInterface> list;

    @Autowired
    private Map<String,BeanInterface> map;

    /** @Autowired默认为byType的  所以有两个相同类型的bean
     * 如果不使用 @Qualifier指定具体的bean就会抛出异常
     *  private BeanInterface beaninterface;
     */
    @Autowired
    @Qualifier("beanImplOne")
    private BeanInterface beaninterface;

    @RequestMapping(value = "/say")
    @ResponseBody
    public String say(){
        System.out.println("list...");
        if(null !=list &&0!=list.size()){
            for(BeanInterface bean :list){
                System.out.println(bean.getClass().getName());
            }

        }else{
            System.out.println("List<BeanInterface> list is null !!!!");
        }
        System.out.println();
        System.out.println("map...");
        if(null !=map &&0!=map.size()){
            for(Map.Entry<String, BeanInterface> m:map.entrySet()){
                System.out.println(m.getKey()+"    "+m.getValue().getClass().getName());
            }
        }else{
            System.out.println("Map<String,BeanInterface> map is null !!!!");

        }
        System.out.println("-------------------------");
        if(null !=beaninterface){
            System.out.println(beaninterface.getClass().getName());
        }else{
            System.out.println("beaninterface is null !!!");
        }
        return "success";
    }




}
