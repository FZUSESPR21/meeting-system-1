package com.example.meet.controller;

import com.example.meet.bean.User;
import com.example.meet.service.serviceImp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: shuKai
 * @Description:
 * @Date: Create in 12:33 2021/3/27
 */
@Controller
public class TestController {
    @Autowired
    UserServiceImp userServiceImp;

    @GetMapping("/get")
    public String getUser(){
        List<User> list = userServiceImp.getAllUser();
        for(User user:list){
            System.out.println(user.getName());
        }
        return "test";
    }
}
