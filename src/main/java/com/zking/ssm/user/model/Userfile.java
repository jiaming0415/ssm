package com.zking.ssm.user.model;

import lombok.ToString;

import java.sql.Timestamp;
import java.util.Date;

@ToString
public class Userfile {
    private Long id;

    private Byte state;

    private String remark;

    private Date audittime;

    private Timestamp applytime;

    private Long auditorId;

    private Long applierId;

    private Byte score;

    private String file;

    private Long filetypeId;

    private String image;

    public Userfile(Long id, Byte state, String remark, Date audittime, Timestamp applytime, Long auditorId, Long applierId, Byte score, String file, Long filetypeId, String image) {
        this.id = id;
        this.state = state;
        this.remark = remark;
        this.audittime = audittime;
        this.applytime = applytime;
        this.auditorId = auditorId;
        this.applierId = applierId;
        this.score = score;
        this.file = file;
        this.filetypeId = filetypeId;
        this.image = image;
    }

    public Userfile() {
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

    public Byte getScore() {
        return score;
    }

    public void setScore(Byte score) {
        this.score = score;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Long getFiletypeId() {
        return filetypeId;
    }

    public void setFiletypeId(Long filetypeId) {
        this.filetypeId = filetypeId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}