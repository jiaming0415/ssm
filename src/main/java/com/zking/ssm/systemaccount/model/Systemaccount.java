package com.zking.ssm.systemaccount.model;

import java.math.BigDecimal;

public class Systemaccount {
    private Integer id;

    private Integer version;

    private BigDecimal usableamount;

    private BigDecimal freezedamount;

    public Systemaccount(Integer id, Integer version, BigDecimal usableamount, BigDecimal freezedamount) {
        this.id = id;
        this.version = version;
        this.usableamount = usableamount;
        this.freezedamount = freezedamount;
    }

    public Systemaccount() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public BigDecimal getUsableamount() {
        return usableamount;
    }

    public void setUsableamount(BigDecimal usableamount) {
        this.usableamount = usableamount;
    }

    public BigDecimal getFreezedamount() {
        return freezedamount;
    }

    public void setFreezedamount(BigDecimal freezedamount) {
        this.freezedamount = freezedamount;
    }
}