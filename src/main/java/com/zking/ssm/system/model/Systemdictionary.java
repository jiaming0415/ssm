package com.zking.ssm.system.model;

public class Systemdictionary {
    private Long id;

    private String sn;

    private String title;

    private String intro;

    public Systemdictionary(Long id, String sn, String title, String intro) {
        this.id = id;
        this.sn = sn;
        this.title = title;
        this.intro = intro;
    }

    public Systemdictionary() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}