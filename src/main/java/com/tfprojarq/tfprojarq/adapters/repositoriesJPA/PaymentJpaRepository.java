package com.tfprojarq.tfprojarq.adapters.repositoriesJPA;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tfprojarq.tfprojarq.domain.entities.Payment;

public interface PaymentJpaRepository extends JpaRepository<Payment, Long> {
}
