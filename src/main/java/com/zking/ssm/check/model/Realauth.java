package com.zking.ssm.check.model;

import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.util.Date;

@ToString
public class Realauth {
    private Long id;

    private String realname;

    private String sex;

    private String borndate;

    private String idnumber;

    private String address;

    private Byte state;

    private String image1;

    private String image2;

    private String remark;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date audittime;

    private Timestamp applytime;

    private Long auditorId;

    private Long applierId;

    public Realauth(Long id, String realname, String sex, String borndate, String idnumber, String address, Byte state, String image1, String image2, String remark, Timestamp audittime, Timestamp applytime, Long auditorId, Long applierId) {
        this.id = id;
        this.realname = realname;
        this.sex = sex;
        this.borndate = borndate;
        this.idnumber = idnumber;
        this.address = address;
        this.state = state;
        this.image1 = image1;
        this.image2 = image2;
        this.remark = remark;
        this.audittime = audittime;
        this.applytime = applytime;
        this.auditorId = auditorId;
        this.applierId = applierId;
    }

    public Realauth() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBorndate() {
        return borndate;
    }

    public void setBorndate(String borndate) {
        this.borndate = borndate;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
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

    public Timestamp getApplytime() {
        return applytime;
    }

    public void setApplytime(Timestamp applytime) {
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
}