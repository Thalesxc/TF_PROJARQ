package com.tfprojarq.tfprojarq.domain.repositories;

import java.util.List;
import java.util.Optional;

import com.tfprojarq.tfprojarq.domain.entities.Subscription;

public interface SubscriptionRepository {
    
    Optional<Subscription> findById(Long id);
    
    Subscription save(Subscription subscription);
    
    void deleteById(Long id);
    
    List<Subscription> findActiveSubscriptions();
    
    List<Subscription> findCancelledSubscriptions();
    
    List<Subscription> findByCustomerId(Long customerId);
    
    List<Subscription> findByApplicationId(Long applicationId);
    
    List<Subscription> findAll();
}