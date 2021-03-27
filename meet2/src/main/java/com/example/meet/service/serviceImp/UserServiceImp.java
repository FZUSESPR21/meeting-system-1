package com.example.meet.service.serviceImp;

import com.example.meet.bean.User;
import com.example.meet.bean.UserShow;
import com.example.meet.mapper.UserMapper;
import com.example.meet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: shuKai
 * @Description:
 * @Date: Create in 12:40 2021/3/27
 */
@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    public Integer registerUser(String userid,String name,String password,Integer meetingid) {
        return userMapper.registerUser(userid,name,password,meetingid);
    }

    public User accessLogin(String userid,String password) {
        return userMapper.accessLogin(userid,password);
    }
}
