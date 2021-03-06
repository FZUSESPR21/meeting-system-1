package com.example.meet.service.serviceImp;

import com.example.meet.bean.MegShow;
import com.example.meet.mapper.MsgMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: shuKai
 * @Description:
 * @Date: Create in 20:14 2021/3/27
 */
@Service
public class MsgServiceImpl {
    @Autowired
    MsgMapper msgMapper;
    public Integer addMsg(String msgdata,String adminname,Integer meetingid,String time){
        return msgMapper.addMSg(msgdata,adminname,meetingid,time);
    }

    public List<MegShow> showMsg(Integer id){
        return msgMapper.showMsg(id);
    }

    public List<MegShow> showMsgAll(){
        return msgMapper.showMsgAll();
    }
}
