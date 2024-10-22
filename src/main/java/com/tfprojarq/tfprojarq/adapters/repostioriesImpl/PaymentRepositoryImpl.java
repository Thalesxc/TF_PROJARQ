package com.tfprojarq.tfprojarq.adapters.repostioriesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tfprojarq.tfprojarq.adapters.repositoriesJPA.PaymentJpaRepository;
import com.tfprojarq.tfprojarq.domain.entities.Payment;
import com.tfprojarq.tfprojarq.domain.repositories.PaymentRepository;
    

@Repository
public class PaymentRepositoryImpl implements PaymentRepository {

    private final PaymentJpaRepository paymentJpaRepository;

    @Autowired
    public PaymentRepositoryImpl(PaymentJpaRepository paymentJpaRepository) {
        this.paymentJpaRepository = paymentJpaRepository;
    }

    @Override
    public Payment save(Payment payment) {
        return paymentJpaRepository.save(payment);
    }

    @Override
    public void deleteById(Long id) {
        paymentJpaRepository.deleteById(id);
    }

    @Override
    public Payment findById(Long id) {
        return paymentJpaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Payment> findAll() {
        return paymentJpaRepository.findAll();
    }
}
