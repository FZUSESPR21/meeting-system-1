package com.example.meet.bean;

/**
 * Created on 2021/3/27/027.
 *
 * @author Lei zhenkang
 */
public class UserShow {
    private String userid;
    private String name;
    private String meetingid;

    public UserShow(String userid, String name,String meetingid) {
        this.userid = userid;
        this.name = name;
        this.meetingid = meetingid;
    }
    public UserShow(){

    }
    public void setMeetingid(String meetingid) {
        this.meetingid = meetingid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getMeetingid() {
        return meetingid;
    }

    public String getName() {
        return name;
    }

    public String getUserid() {
        return userid;
    }
}
