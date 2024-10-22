package com.tfprojarq.tfprojarq.adapters.repositoriesJPA;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tfprojarq.tfprojarq.domain.entities.Customer;

public interface CustomerJpaRepository extends JpaRepository<Customer, Long> {
}