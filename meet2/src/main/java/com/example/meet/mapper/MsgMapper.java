package com.example.meet.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: shuKai
 * @Description:
 * @Date: Create in 20:01 2021/3/27
 */
@Mapper
public interface MsgMapper {

    @Insert("INSERT INTO message (msgdata,adminname,meetingid,time) values(#{msgdata},#{adminname},#{meetingid},#{time})")
    public Integer addMSg(@Param("msgdata") String msgdata,@Param("adminname") String adminname,@Param("meetingid") Integer meetingid,@Param("time") String time);
}
