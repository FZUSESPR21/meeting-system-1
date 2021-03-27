package com.example.meet.bean;

/**
 * @Author: shuKai
 * @Description:
 * @Date: Create in 18:49 2021/3/27
 */
public class UserResponse {
    private Integer code;
    private User user;

    public UserResponse() {
    }


    @Override
    public String toString() {
        return "UserResponse{" +
                "code=" + code +
                ", user=" + user +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
