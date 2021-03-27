package com.example.meet.bean;

/**
 * @Author: shuKai
 * @Description:
 * @Date: Create in 12:35 2021/3/27
 */
public class User {
    private String userid;
    private String name;
    private String password;
    private Integer meetingid;

    public User(String userid, String name, String password, Integer meetingid) {
        this.userid = userid;
        this.name = name;
        this.password = password;
        this.meetingid = meetingid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getMeetingid() {
        return meetingid;
    }

    public void setMeetingid(Integer meetingid) {
        this.meetingid = meetingid;
    }
}
