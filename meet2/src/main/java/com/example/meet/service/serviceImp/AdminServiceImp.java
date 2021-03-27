package com.example.meet.service.serviceImp;

import com.example.meet.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created on 2021/3/27.
 *
 * @author Chen Yao
 */
@Service
public class AdminServiceImp {
    @Autowired
    AdminMapper adminMapper;
    public Integer insAdmin(String adminid, String password, Integer meetingid, Integer identity){
        return adminMapper.insAdmin(adminid, password, meetingid, identity);
    }
}
