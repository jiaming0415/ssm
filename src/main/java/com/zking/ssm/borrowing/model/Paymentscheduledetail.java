package com.zking.ssm.borrowing.model;

import java.math.BigDecimal;
import java.util.Date;

public class Paymentscheduledetail {
    private String id;

    private BigDecimal bidamount;

    private Long bidId;

    private BigDecimal totalamount;

    private BigDecimal principal;

    private BigDecimal interest;

    private Integer monthindex;

    private Date deadline;

    private Long bidrequestId;

    private Date paydate;

    private Integer returntype;

    private Long paymentscheduleId;

    private Long fromlogininfoId;

    private Long tologininfoId;

    public Paymentscheduledetail(String id, BigDecimal bidamount, Long bidId, BigDecimal totalamount, BigDecimal principal, BigDecimal interest, Integer monthindex, Date deadline, Long bidrequestId, Date paydate, Integer returntype, Long paymentscheduleId, Long fromlogininfoId, Long tologininfoId) {
        this.id = id;
        this.bidamount = bidamount;
        this.bidId = bidId;
        this.totalamount = totalamount;
        this.principal = principal;
        this.interest = interest;
        this.monthindex = monthindex;
        this.deadline = deadline;
        this.bidrequestId = bidrequestId;
        this.paydate = paydate;
        this.returntype = returntype;
        this.paymentscheduleId = paymentscheduleId;
        this.fromlogininfoId = fromlogininfoId;
        this.tologininfoId = tologininfoId;
    }

    public Paymentscheduledetail() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getBidamount() {
        return bidamount;
    }

    public void setBidamount(BigDecimal bidamount) {
        this.bidamount = bidamount;
    }

    public Long getBidId() {
        return bidId;
    }

    public void setBidId(Long bidId) {
        this.bidId = bidId;
    }

    public BigDecimal getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(BigDecimal totalamount) {
        this.totalamount = totalamount;
    }

    public BigDecimal getPrincipal() {
        return principal;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public Integer getMonthindex() {
        return monthindex;
    }

    public void setMonthindex(Integer monthindex) {
        this.monthindex = monthindex;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Long getBidrequestId() {
        return bidrequestId;
    }

    public void setBidrequestId(Long bidrequestId) {
        this.bidrequestId = bidrequestId;
    }

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    public Integer getReturntype() {
        return returntype;
    }

    public void setReturntype(Integer returntype) {
        this.returntype = returntype;
    }

    public Long getPaymentscheduleId() {
        return paymentscheduleId;
    }

    public void setPaymentscheduleId(Long paymentscheduleId) {
        this.paymentscheduleId = paymentscheduleId;
    }

    public Long getFromlogininfoId() {
        return fromlogininfoId;
    }

    public void setFromlogininfoId(Long fromlogininfoId) {
        this.fromlogininfoId = fromlogininfoId;
    }

    public Long getTologininfoId() {
        return tologininfoId;
    }

    public void setTologininfoId(Long tologininfoId) {
        this.tologininfoId = tologininfoId;
    }
}