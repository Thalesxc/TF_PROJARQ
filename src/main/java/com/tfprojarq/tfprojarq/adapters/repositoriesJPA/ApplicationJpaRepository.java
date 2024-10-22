package com.tfprojarq.tfprojarq.adapters.repositoriesJPA;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tfprojarq.tfprojarq.domain.entities.Application;

public interface ApplicationJpaRepository extends JpaRepository<Application, Long> {
}
