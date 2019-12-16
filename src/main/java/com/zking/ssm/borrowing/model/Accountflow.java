package com.zking.ssm.borrowing.model;

import java.math.BigDecimal;
import java.util.Date;

public class Accountflow {
    private Long id;

    private BigDecimal amount;

    private String note;

    private Date tradetime;

    private Byte actiontype;

    private Long accountId;

    private BigDecimal usableamount;

    private BigDecimal freezedamount;

    public Accountflow(Long id, BigDecimal amount, String note, Date tradetime, Byte actiontype, Long accountId, BigDecimal usableamount, BigDecimal freezedamount) {
        this.id = id;
        this.amount = amount;
        this.note = note;
        this.tradetime = tradetime;
        this.actiontype = actiontype;
        this.accountId = accountId;
        this.usableamount = usableamount;
        this.freezedamount = freezedamount;
    }

    public Accountflow() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
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