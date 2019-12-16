package com.zking.ssm.book.service.imp;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.book.mapper.BookMapper;
import com.zking.ssm.book.model.Book;
import com.zking.ssm.book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    private BookMapper bookMapper;

    @Transactional(readOnly = true)
    @Override
    public List<Book> queryBookPager(Book book,PageBean pageBean) {
        return bookMapper.queryBookPager(book);
    }

    @Override
    public Book selectByPrimaryKey(Integer id) {
        return bookMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(Book record) {
        return bookMapper.insert(record);
    }
}
