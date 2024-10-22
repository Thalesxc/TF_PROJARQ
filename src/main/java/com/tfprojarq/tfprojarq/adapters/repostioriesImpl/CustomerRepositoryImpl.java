package com.tfprojarq.tfprojarq.adapters.repostioriesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tfprojarq.tfprojarq.adapters.repositoriesJPA.CustomerJpaRepository;
import com.tfprojarq.tfprojarq.domain.entities.Customer;
import com.tfprojarq.tfprojarq.domain.repositories.CustomerRepository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    private final CustomerJpaRepository customerJpaRepository;

    @Autowired
    public CustomerRepositoryImpl(CustomerJpaRepository customerJpaRepository) {
        this.customerJpaRepository = customerJpaRepository;
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerJpaRepository.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        return customerJpaRepository.save(customer);
    }

    @Override
    public void deleteById(Long id) {
        customerJpaRepository.deleteById(id);
    }

    @Override
    public List<Customer> findAll() {
        return customerJpaRepository.findAll();
    }
}