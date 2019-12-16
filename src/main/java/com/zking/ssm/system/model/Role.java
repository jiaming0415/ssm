package com.zking.ssm.system.model;

import lombok.ToString;

@ToString
public class Role {
    private String roleid;

    private String rolename;

    public Role(String roleid, String rolename) {
        this.roleid = roleid;
        this.rolename = rolename;
    }

    public Role() {
        super();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}