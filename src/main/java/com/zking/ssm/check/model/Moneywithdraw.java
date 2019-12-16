package com.zking.ssm.check.model;

import java.math.BigDecimal;
import java.util.Date;

public class Moneywithdraw {
    private Long id;

    private Byte state;

    private String remark;

    private Date audittime;

    private Date applytime;

    private Long auditorId;

    private Long applierId;

    private BigDecimal amount;

    private BigDecimal fee;

    private String bankname;

    private String accountname;

    private String accountnumber;

    private String forkname;

    public Moneywithdraw(Long id, Byte state, String remark, Date audittime, Date applytime, Long auditorId, Long applierId, BigDecimal amount, BigDecimal fee, String bankname, String accountname, String accountnumber, String forkname) {
        this.id = id;
        this.state = state;
        this.remark = remark;
        this.audittime = audittime;
        this.applytime = applytime;
        this.auditorId = auditorId;
        this.applierId = applierId;
        this.amount = amount;
        this.fee = fee;
        this.bankname = bankname;
        this.accountname = accountname;
        this.accountnumber = accountnumber;
        this.forkname = forkname;
    }

    public Moneywithdraw() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getAudittime() {
        return audittime;
    }

    public void setAudittime(Date audittime) {
        this.audittime = audittime;
    }

    public Date getApplytime() {
        return applytime;
    }

    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    public Long getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(Long auditorId) {
        this.auditorId = auditorId;
    }

    public Long getApplierId() {
        return applierId;
    }

    public void setApplierId(Long applierId) {
        this.applierId = applierId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
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
}