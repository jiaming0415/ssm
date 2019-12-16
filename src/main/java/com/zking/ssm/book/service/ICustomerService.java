package com.zking.ssm.book.service;

import com.zking.ssm.book.model.Customer;

import java.util.List;


public interface ICustomerService {


    List<Customer> queryCustomerOneToMany();

}