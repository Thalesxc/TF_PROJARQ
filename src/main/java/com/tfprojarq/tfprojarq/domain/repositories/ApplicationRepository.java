package com.tfprojarq.tfprojarq.domain.repositories;

import java.util.List;
import java.util.Optional;

import com.tfprojarq.tfprojarq.domain.entities.Application;

public interface ApplicationRepository {
    
    Optional<Application> findById(Long id);
    
    Application save(Application application);
    
    void deleteById(Long id);
    
    List<Application> findAll();
}