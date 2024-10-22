package com.tfprojarq.tfprojarq.adapters.repositoriesJPA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tfprojarq.tfprojarq.domain.entities.Subscription;

public interface SubscriptionJpaRepository extends JpaRepository<Subscription, Long> {

    @Query("SELECT s FROM Subscription s WHERE s.endDate > CURRENT_DATE")
    List<Subscription> findActiveSubscriptions();

    @Query("SELECT s FROM Subscription s WHERE s.endDate <= CURRENT_DATE")
    List<Subscription> findCancelledSubscriptions();

    List<Subscription> findByCustomerId(Long customerId);

    List<Subscription> findByApplicationId(Long applicationId);
}
