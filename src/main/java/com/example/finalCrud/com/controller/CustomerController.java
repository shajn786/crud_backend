package com.example.finalCrud.com.controller;


import com.example.finalCrud.com.dto.ResponseDto;
import com.example.finalCrud.com.entity.Customer;
import com.example.finalCrud.com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    Customer c = null;
    @Autowired
    CustomerService customerService;

    @CrossOrigin(origins = "*")
    @PostMapping(value = "addcustomer" ,consumes = "application/json", produces = "application/json")
    public ResponseDto addCustomer(@RequestBody Customer customer)
    {
        return  customerService.addCustomer(customer);
    }

    @CrossOrigin(origins = "*")
    @PostMapping(value = "updatecustomer" ,consumes = "application/json", produces = "application/json")
    public ResponseDto updateCustomer(@RequestBody Customer customer)
    {
        System.out.println(customer.getId());

        return customerService.updateCustomer(customer);

    }
    @CrossOrigin(origins = "*")
    @GetMapping("findcustomer/{id}")
    public List<Customer> findCustomer(@PathVariable int id)
    {
        return  customerService.oneCustomer(id);

    }
    @CrossOrigin(origins = "*")
    @DeleteMapping("deletecustomer/{id}")
    public  ResponseDto deleteCustomer(@PathVariable int id)
    {
        return  customerService.deleteCustomer(id);
    }

    @CrossOrigin(origins = "*")
    @PostMapping(value = "login" ,consumes = "application/json", produces = "application/json")
    public Customer login(@RequestBody Customer c)
    {

        return customerService.login(c.getUsername(),c.getPassword());
    }


    @CrossOrigin(origins = "*")
    @GetMapping("allcustomer")
    public  List<Customer> allCustomer()
    {
        return customerService.allCustomer();
    }

}
