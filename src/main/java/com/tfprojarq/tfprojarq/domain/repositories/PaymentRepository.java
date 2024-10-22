package com.tfprojarq.tfprojarq.domain.repositories;

import java.util.List;

import com.tfprojarq.tfprojarq.domain.entities.Payment;

public interface PaymentRepository {
    
    Payment findById(Long id);
    
    Payment save(Payment payment);
    
    void deleteById(Long id);
    
    List<Payment> findAll();
}
