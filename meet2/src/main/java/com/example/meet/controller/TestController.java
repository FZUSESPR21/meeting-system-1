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

import java.util.ArrayList;
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



    @GetMapping("/index")
    public String index(){
        return "test";
    }
    @GetMapping("/userpage1")
    public String index2(){
        return "userPage";
    }
    @GetMapping("/userpage2")
    public String index3(){
        return "userPage_two";
    }
    @GetMapping("/userpage3")
    public String index4(){
        return "userPage_three";
    }

    @ResponseBody
    @GetMapping("/get")
    @CrossOrigin(origins = "*", maxAge = 3600)
    public List<UserShow> getUser(){
        List<User> list = userServiceImp.getAllUser();
        List<UserShow> listshow = new ArrayList<>();
        for (int i=0;i<list.size();i++){
            UserShow userShow = new UserShow();
            userShow.setName(list.get(i).getName());
            userShow.setUserid(list.get(i).getUserid());
            if (list.get(i).getMeetingid()==0){
                userShow.setMeetingid("非会员");
            }
            else if(list.get(i).getMeetingid()==1){
                userShow.setMeetingid("分论坛一会员");
            }
            else if(list.get(i).getMeetingid()==2){
                userShow.setMeetingid("分论坛二会员");
            }
            else {
                userShow.setMeetingid("分论坛一、二的会员\n");
            }
            listshow.add(userShow);
        }
        return listshow;
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @ResponseBody
    @GetMapping("/getpeople")
    @CrossOrigin(origins = "*", maxAge = 3600)
    public int[] ShowPeopleBranch(){
        List<User> list = userServiceImp.getAllUser();
        int[] peopleNum = new int[2];
        for (int i=0;i<list.size();i++){
            if (list.get(i).getMeetingid()==1){
                peopleNum[0]++;
            }
            else if (list.get(i).getMeetingid()==2){
                peopleNum[1]++;
            }
            else {
                peopleNum[0]++;
                peopleNum[1]++;
            }
        }
        return peopleNum;
    }
}
