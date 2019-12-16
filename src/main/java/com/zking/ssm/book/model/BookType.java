package com.zking.ssm.book.model;

import lombok.*;

import java.io.Serializable;

@Data
public class BookType implements Serializable {
    private Integer id;
    private String name;

    public BookType() {
    }

    public BookType(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
