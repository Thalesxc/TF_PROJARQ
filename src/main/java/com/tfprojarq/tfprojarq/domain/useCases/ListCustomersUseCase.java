package com.tfprojarq.tfprojarq.domain.useCases;

import java.util.List;

import com.tfprojarq.tfprojarq.domain.entities.Customer;

public interface ListCustomersUseCase {
    List<Customer> listAll();
}
