package com.example.meet.bean;

/**
 * @Author: shuKai
 * @Description:
 * @Date: Create in 19:09 2021/3/27
 */
public class Admin {
    private String adminid;
    private String name;
    private String password;
    private String identity;

    public Admin() {
    }

    public Admin(String adminid, String name, String password, String identity) {
        this.adminid = adminid;
        this.name = name;
        this.password = password;
        this.identity = identity;
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
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

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }
}
