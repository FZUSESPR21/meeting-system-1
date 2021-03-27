package com.example.meet.controller;

import com.example.meet.bean.Admin;
import com.example.meet.bean.AdminResponse;
import com.example.meet.bean.User;
import com.example.meet.bean.UserResponse;
import com.example.meet.service.serviceImp.AdminServiceImpl;
import com.example.meet.service.serviceImp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: shuKai
 * @Description:
 * @Date: Create in 17:09 2021/3/27
 */

@Controller
public class LoginController {

    @Autowired
    UserServiceImp userServiceImp;
    @Autowired
    AdminServiceImpl adminService;

    @ResponseBody
    @CrossOrigin
    @RequestMapping("/accessLoginN")
    public UserResponse Login_1(@RequestBody String k) {
        UserResponse userResponse = new UserResponse();
        String[] profile = k.split("\\+");
        profile[1] = profile[1].replace("=","");
        User user = userServiceImp.accessLogin(profile[0],profile[1]);
        for(String oop:profile){
            System.out.println(oop);
        }
        if(user!=null){
            userResponse.setCode(1);
            userResponse.setUser(user);
        }else{
            userResponse.setCode(2);
        }
        return userResponse;
    }

    @ResponseBody
    @CrossOrigin
    @RequestMapping("/accessLoginP")
    public AdminResponse Login_2(@RequestBody String k) {
        AdminResponse adminResponse = new AdminResponse();
        String[] profile = k.split("\\+");
        profile[1] = profile[1].replace("=","");
        Admin admin = adminService.accessLogin(profile[0],profile[1]);
        if(admin!=null){
            adminResponse.setCode(1);
            adminResponse.setAdmin(admin);
        }else{
            adminResponse.setCode(2);
        }
        return adminResponse;
    }


}
