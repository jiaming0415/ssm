package com.zking.ssm.check.model;

import java.util.Date;

public class Emailverify {
    private Long id;

    private String email;

    private Long userinfoId;

    private Date sendtime;

    private String uuid;

    public Emailverify(Long id, String email, Long userinfoId, Date sendtime, String uuid) {
        this.id = id;
        this.email = email;
        this.userinfoId = userinfoId;
        this.sendtime = sendtime;
        this.uuid = uuid;
    }

    public Emailverify() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getUserinfoId() {
        return userinfoId;
    }

    public void setUserinfoId(Long userinfoId) {
        this.userinfoId = userinfoId;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}