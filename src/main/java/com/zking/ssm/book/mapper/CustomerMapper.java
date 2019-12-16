package com.zking.ssm.book.mapper;

import com.zking.ssm.book.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerMapper {


    List<Customer> queryCustomerOneToMany();

}