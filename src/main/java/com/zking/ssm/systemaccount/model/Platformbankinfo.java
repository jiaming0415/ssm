package com.zking.ssm.systemaccount.model;

public class Platformbankinfo {
    private Integer id;

    private String bankname;

    private String accountname;

    private String accountnumber;

    private String forkname;

    private String iconcls;

    public Platformbankinfo(Integer id, String bankname, String accountname, String accountnumber, String forkname, String iconcls) {
        this.id = id;
        this.bankname = bankname;
        this.accountname = accountname;
        this.accountnumber = accountnumber;
        this.forkname = forkname;
        this.iconcls = iconcls;
    }

    public Platformbankinfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getIconcls() {
        return iconcls;
    }

    public void setIconcls(String iconcls) {
        this.iconcls = iconcls;
    }
}