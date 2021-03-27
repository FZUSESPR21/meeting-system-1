package com.example.meet.bean;

/**
 * @Author: shuKai
 * @Description:
 * @Date: Create in 19:09 2021/3/27
 */
public class AdminResponse {
    private Integer code;
    private Admin admin;

    public AdminResponse() {
    }

    public AdminResponse(Integer code, Admin admin) {
        this.code = code;
        this.admin = admin;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
