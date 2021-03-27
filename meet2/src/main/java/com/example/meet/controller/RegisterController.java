package com.example.meet.controller;

import com.example.meet.bean.User;
import com.example.meet.service.serviceImp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created on 2021/3/27/027.
 *
 * @author Lei zhenkang
 */
@Controller
public class RegisterController {
    @Autowired
    UserServiceImp userServiceImp;

    @ResponseBody
    @CrossOrigin
    @RequestMapping("/register")
    public int register(@RequestBody String k){
        System.out.println("111");
        String[] profile = k.split("\\+");
        if (userServiceImp.searchUser(profile[0])==0){
            if (userServiceImp.registerUser(profile[0],profile[1],profile[2])==1){
                return 1;
            }
            else {
                return 2;
            }
        }
        else {
            return 0;
        }
    }
}
