package com.zking.ssm.systemaccount.model;

public class Userbankinfo {
    private Long id;

    private String bankname;

    private String accountname;

    private String accountnumber;

    private String forkname;

    private Long logininfoId;

    public Userbankinfo(Long id, String bankname, String accountname, String accountnumber, String forkname, Long logininfoId) {
        this.id = id;
        this.bankname = bankname;
        this.accountname = accountname;
        this.accountnumber = accountnumber;
        this.forkname = forkname;
        this.logininfoId = logininfoId;
    }

    public Userbankinfo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getForkname() {
        return forkname;
    }

    public void setForkname(String forkname) {
        this.forkname = forkname;
    }

    public Long getLogininfoId() {
        return logininfoId;
    }

    public void setLogininfoId(Long logininfoId) {
        this.logininfoId = logininfoId;
    }
}