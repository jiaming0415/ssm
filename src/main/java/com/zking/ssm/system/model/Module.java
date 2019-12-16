package com.zking.ssm.system.model;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class Module {
    private String id;

    private String pid;

    private String text;

    private String icon;

    private String url;

    private Integer sort;

    private List<Module> children=new ArrayList<Module>();

    public Module(String id, String pid, String text, String icon, String url, Integer sort) {
        this.id = id;
        this.pid = pid;
        this.text = text;
        this.icon = icon;
        this.url = url;
        this.sort = sort;
    }


    public Module() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public List<Module> getChildren() {
        return children;
    }

    public void setChildren(List<Module> children) {
        this.children = children;
    }
}