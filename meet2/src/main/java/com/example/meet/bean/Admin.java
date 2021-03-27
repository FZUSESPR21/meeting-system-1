package com.example.meet.bean;

public class Admin {
    private String adminid;
    private String password;
    private Integer meetingid;
    private Integer identity;

    public Admin(String adminid, String password, Integer meetingid, Integer identity ){
        this.adminid = adminid;
        this.password = password;
        this.meetingid = meetingid;
        this.identity = identity;
    }

    public Integer getIdentity() {
        return identity;
    }

    public String getAdminid() {
        return adminid;
    }

    public Integer getMeetingid() {
        return meetingid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public void setMeetingid(Integer meetingid) {
        this.meetingid = meetingid;
    }
}
