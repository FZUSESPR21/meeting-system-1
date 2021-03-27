package com.example.meet.controller;

import com.example.meet.bean.User;
import com.example.meet.bean.UserShow;
import com.example.meet.service.serviceImp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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


    @ResponseBody
    @GetMapping("/get")
    @CrossOrigin(origins = "*", maxAge = 3600)
    public List<UserShow> getUser(){
        List<UserShow> list = userServiceImp.getAllUser();
        return list;
    }
}
