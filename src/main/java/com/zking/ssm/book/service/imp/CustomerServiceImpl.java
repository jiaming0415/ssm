package com.zking.ssm.book.service.imp;

import com.zking.ssm.book.mapper.CustomerMapper;
import com.zking.ssm.book.model.Customer;
import com.zking.ssm.book.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> queryCustomerOneToMany() {
        return customerMapper.queryCustomerOneToMany();
    }
}
