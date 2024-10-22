package com.tfprojarq.tfprojarq.domain.repositories;

import java.util.List;
import java.util.Optional;

import com.tfprojarq.tfprojarq.domain.entities.Customer;

public interface CustomerRepository {
    
    Optional<Customer> findById(Long id);
    
    Customer save(Customer customer);
    
    void deleteById(Long id);
    
    List<Customer> findAll();
}