package com.zking.ssm.user.model;

public class Logininfo {
    private Long id;

    private String username;

    private String password;

    private Byte state;

    private Integer usertype;

    public Logininfo(Long id, String username, String password, Byte state, Integer usertype) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.state = state;
        this.usertype = usertype;
    }

    public Logininfo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }
}