package com.example.finalCrud.com.service;


import com.example.finalCrud.com.dao.CustomerDao;
import com.example.finalCrud.com.dto.ResponseDto;
import com.example.finalCrud.com.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDao customerDao;

    ResponseDto message = new ResponseDto();



    @Override
    public ResponseDto addCustomer(Customer c) {

        customerDao.save(c);
        message.setMessage("added sucessfully");
        return  message;

    }

    @Override
    public ResponseDto updateCustomer(Customer c) {
        System.out.println(c);
        customerDao.save(c);
        message.setMessage("updated successfully");
        return message;
    }

    @Override
    public List<Customer> oneCustomer(int id) {
        List<Customer> result = new ArrayList<>();
        Customer c= customerDao.findById(id).get();
        result.add(c);
        return result;
    }

    @Override
    public ResponseDto deleteCustomer(int id) {

        customerDao.deleteById(id);
        message.setMessage("deleted succesfully");
        return message;
    }

    @Override
    public Customer login(String username, String password) {
        return customerDao.login(username,password);
    }

    @Override
    public List<Customer> allCustomer() {
        return customerDao.findAll();
    }
}
