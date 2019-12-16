package com.zking.ssm.system.model;

public class RoleModule {
    private String roleid;

    private String moduleid;

    public RoleModule(String roleid, String moduleid) {
        this.roleid = roleid;
        this.moduleid = moduleid;
    }

    public RoleModule() {
        super();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getModuleid() {
        return moduleid;
    }

    public void setModuleid(String moduleid) {
        this.moduleid = moduleid;
    }
}