package com.example.finalCrud.com.dao;


import com.example.finalCrud.com.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {

    @Query(value = "select * from customer where username= :username and password= :password",nativeQuery = true)
    Customer login(@Param("username") String username, @Param("password") String password);
}
