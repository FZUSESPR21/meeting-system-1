package com.example.meet.service.serviceImp;

import com.example.meet.mapper.MsgMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: shuKai
 * @Description:
 * @Date: Create in 20:14 2021/3/27
 */
public class MsgServiceImpl {
    @Autowired
    MsgMapper msgMapper;
    public Integer addMsg(String msgdata,String adminname,Integer meetingid,String time){
        return msgMapper.addMSg(msgdata,adminname,meetingid,time);
    }
}
