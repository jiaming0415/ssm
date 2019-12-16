package com.zking.ssm.book.service;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.book.model.Book;

import java.util.List;


public interface IBookService {
    List<Book> queryBookPager(Book book,PageBean pageBean);

    Book selectByPrimaryKey(Integer id);
    int insert(Book record);
}