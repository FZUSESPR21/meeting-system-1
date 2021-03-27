package com.example.meet.bean;

/**
 * @Author: shuKai
 * @Description:
 * @Date: Create in 19:57 2021/3/27
 */
public class Msg {
    private Integer msgid;
    private String msgdata;
    private String adminname;
    private Integer meetingid;
    private String time;

    public Msg() {
    }

    public Msg(Integer msgid, String msgdata, String adminname, Integer meetingid, String time) {
        this.msgid = msgid;
        this.msgdata = msgdata;
        this.adminname = adminname;
        this.meetingid = meetingid;
        this.time = time;
    }

    public Integer getMsgid() {
        return msgid;
    }

    public void setMsgid(Integer msgid) {
        this.msgid = msgid;
    }

    public String getMsgdata() {
        return msgdata;
    }

    public void setMsgdata(String msgdata) {
        this.msgdata = msgdata;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public Integer getMeetingid() {
        return meetingid;
    }

    public void setMeetingid(Integer meetingid) {
        this.meetingid = meetingid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
