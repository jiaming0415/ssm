package com.zking.ssm.book.model;

import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@ToString
public class Book implements Serializable{
    private Integer id;

    private String bookname;

    private Float price;

    private String booktype;

    private Date createdate;

    public Book(Integer id, String bookname, Float price, String booktype, Date createdate) {
        this.id = id;
        this.bookname = bookname;
        this.price = price;
        this.booktype = booktype;
        this.createdate = createdate;
    }

    public Book() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}