package com.example.meet.controller;

import com.example.meet.bean.MegShow;
import com.example.meet.bean.Msg;
import com.example.meet.mapper.MsgMapper;
import com.example.meet.service.serviceImp.MsgServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: shuKai
 * @Description:
 * @Date: Create in 20:21 2021/3/27
 */
@Controller
public class MsgController {

    @Autowired
    MsgServiceImpl msgService;


    @CrossOrigin
    @RequestMapping("/addMsg")
    public void addMsg(@RequestBody String k) throws UnsupportedEncodingException {
        k = URLDecoder.decode(URLDecoder.decode(k, "UTF-8"),"UTF-8");
        String[] profile = k.split("\\^");
        profile[2] = profile[2].substring(0,profile[2].length()-1);
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());

        Integer msg = msgService.addMsg(profile[2],profile[0],Integer.parseInt(profile[1]),formatter.format(date));
    }

    @ResponseBody
    @CrossOrigin
    @RequestMapping("/msgshow")
    public List<MegShow> msgShow(@RequestBody int k) {
        List<MegShow> megShowgs = new ArrayList<>();

        if (k != 3) {
            megShowgs = msgService.showMsg(k);
        } else {
            megShowgs = msgService.showMsgAll();
        }
        return megShowgs;
    }
}
