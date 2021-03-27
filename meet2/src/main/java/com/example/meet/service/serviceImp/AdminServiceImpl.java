package com.example.meet.service.serviceImp;

import com.example.meet.bean.Admin;
import com.example.meet.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: shuKai
 * @Description:
 * @Date: Create in 19:12 2021/3/27
 */
@Service
public class AdminServiceImpl {
    @Autowired
    AdminMapper adminMapper;

    public Admin accessLogin(String adminid,String password){
        return adminMapper.accessLogin(adminid,password);
    }

}
