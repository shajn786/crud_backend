package com.example.finalCrud.com.service;


import com.example.finalCrud.com.dto.ResponseDto;
import com.example.finalCrud.com.entity.Customer;

import java.util.List;

public interface CustomerService {

    ResponseDto addCustomer(Customer c);

    ResponseDto updateCustomer(Customer c);

    List<Customer> oneCustomer (int id);

    ResponseDto deleteCustomer(int id);

    Customer login(String username, String password);

    List<Customer> allCustomer();
}
