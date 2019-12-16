package com.zking.ssm.systemaccount.model;

import java.math.BigDecimal;
import java.util.Date;

public class Systemaccountflow {
    private Integer id;

    private Integer systemaccountid;

    private Integer ccountid;

    private Date tradetime;

    private Byte actiontype;

    private BigDecimal amount;

    private BigDecimal usableamount;

    private BigDecimal freezedamount;

    private String note;

    public Systemaccountflow(Integer id, Integer systemaccountid, Integer ccountid, Date tradetime, Byte actiontype, BigDecimal amount, BigDecimal usableamount, BigDecimal freezedamount, String note) {
        this.id = id;
        this.systemaccountid = systemaccountid;
        this.ccountid = ccountid;
        this.tradetime = tradetime;
        this.actiontype = actiontype;
        this.amount = amount;
        this.usableamount = usableamount;
        this.freezedamount = freezedamount;
        this.note = note;
    }

    public Systemaccountflow() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSystemaccountid() {
        return systemaccountid;
    }

    public void setSystemaccountid(Integer systemaccountid) {
        this.systemaccountid = systemaccountid;
    }

    public Integer getCcountid() {
        return ccountid;
    }

    public void setCcountid(Integer ccountid) {
        this.ccountid = ccountid;
    }

    public Date getTradetime() {
        return tradetime;
    }

    public void setTradetime(Date tradetime) {
        this.tradetime = tradetime;
    }

    public Byte getActiontype() {
        return actiontype;
    }

    public void setActiontype(Byte actiontype) {
        this.actiontype = actiontype;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}