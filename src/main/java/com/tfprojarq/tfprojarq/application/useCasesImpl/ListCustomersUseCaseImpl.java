package com.tfprojarq.tfprojarq.application.useCasesImpl;

import java.util.List;

import com.tfprojarq.tfprojarq.domain.entities.Customer;
import com.tfprojarq.tfprojarq.domain.repositories.CustomerRepository;
import com.tfprojarq.tfprojarq.domain.useCases.ListCustomersUseCase;

public class ListCustomersUseCaseImpl implements ListCustomersUseCase {

    private final CustomerRepository customerRepository;

    public ListCustomersUseCaseImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> listAll() {
        return customerRepository.findAll();
    }
}
