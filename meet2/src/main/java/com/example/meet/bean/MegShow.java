package com.example.meet.bean;

/**
 * @ClassName MegShow
 * @Author LeeChang
 * @Date 2021/3/27 21:24
 * @Description MegShow
 * @Version 1.0
 */
public class MegShow {
    private String msgdata;
    private String adminname;

    public MegShow() {
    }

    public MegShow(Integer msgid, String msgdata, String adminname, Integer meetingid, String time) {

        this.msgdata = msgdata;
        this.adminname = adminname;

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
}
