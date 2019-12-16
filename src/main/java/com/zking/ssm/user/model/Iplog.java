package com.zking.ssm.user.model;

import java.util.Date;

public class Iplog {
    private Long id;

    private String ip;

    private Byte state;

    private String username;

    private Long logininfoid;

    private Byte usertype;

    private Date logintime;

    public Iplog(Long id, String ip, Byte state, String username, Long logininfoid, Byte usertype, Date logintime) {
        this.id = id;
        this.ip = ip;
        this.state = state;
        this.username = username;
        this.logininfoid = logininfoid;
        this.usertype = usertype;
        this.logintime = logintime;
    }

    public Iplog() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getLogininfoid() {
        return logininfoid;
    }

    public void setLogininfoid(Long logininfoid) {
        this.logininfoid = logininfoid;
    }

    public Byte getUsertype() {
        return usertype;
    }

    public void setUsertype(Byte usertype) {
        this.usertype = usertype;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }
}