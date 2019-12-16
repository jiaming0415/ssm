package com.zking.ssm.check.model;

import java.util.Date;

public class Mailverify {
    private Long id;

    private Long userinfoId;

    private Date deadline;

    private String randomcode;

    public Mailverify(Long id, Long userinfoId, Date deadline, String randomcode) {
        this.id = id;
        this.userinfoId = userinfoId;
        this.deadline = deadline;
        this.randomcode = randomcode;
    }

    public Mailverify() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserinfoId() {
        return userinfoId;
    }

    public void setUserinfoId(Long userinfoId) {
        this.userinfoId = userinfoId;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getRandomcode() {
        return randomcode;
    }

    public void setRandomcode(String randomcode) {
        this.randomcode = randomcode;
    }
}