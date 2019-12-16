package com.zking.ssm.check.model;

import java.util.Date;

public class Rechargeoffline {
    private Integer id;

    private Integer state;

    private String remark;

    private Date audittime;

    private Date applytime;

    private Integer auditorId;

    private Integer applierId;

    private String tradecode;

    private Date tradetime;

    private Float amount;

    private String note;

    private Integer bankinfoId;

    public Rechargeoffline(Integer id, Integer state, String remark, Date audittime, Date applytime, Integer auditorId, Integer applierId, String tradecode, Date tradetime, Float amount, String note, Integer bankinfoId) {
        this.id = id;
        this.state = state;
        this.remark = remark;
        this.audittime = audittime;
        this.applytime = applytime;
        this.auditorId = auditorId;
        this.applierId = applierId;
        this.tradecode = tradecode;
        this.tradetime = tradetime;
        this.amount = amount;
        this.note = note;
        this.bankinfoId = bankinfoId;
    }

    public Rechargeoffline() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
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

    public Integer getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(Integer auditorId) {
        this.auditorId = auditorId;
    }

    public Integer getApplierId() {
        return applierId;
    }

    public void setApplierId(Integer applierId) {
        this.applierId = applierId;
    }

    public String getTradecode() {
        return tradecode;
    }

    public void setTradecode(String tradecode) {
        this.tradecode = tradecode;
    }

    public Date getTradetime() {
        return tradetime;
    }

    public void setTradetime(Date tradetime) {
        this.tradetime = tradetime;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getBankinfoId() {
        return bankinfoId;
    }

    public void setBankinfoId(Integer bankinfoId) {
        this.bankinfoId = bankinfoId;
    }
}