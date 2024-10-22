package com.tfprojarq.tfprojarq.adapters.repostioriesImpl;

import java.util.Optional;
import java.util.List;

import com.tfprojarq.tfprojarq.domain.entities.Subscription;
import com.tfprojarq.tfprojarq.domain.repositories.SubscriptionRepository;
import com.tfprojarq.tfprojarq.adapters.repositoriesJPA.SubscriptionJpaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SubscriptionRepositoryImpl implements SubscriptionRepository {

    private final SubscriptionJpaRepository subscriptionJpaRepository;

    @Autowired
    public SubscriptionRepositoryImpl(SubscriptionJpaRepository subscriptionJpaRepository) {
        this.subscriptionJpaRepository = subscriptionJpaRepository;
    }

    @Override
    public Optional<Subscription> findById(Long id) {
        return subscriptionJpaRepository.findById(id);
    }

    @Override
    public Subscription save(Subscription subscription) {
        return subscriptionJpaRepository.save(subscription);
    }

    @Override
    public void deleteById(Long id) {
        subscriptionJpaRepository.deleteById(id);
    }

    @Override
    public List<Subscription> findActiveSubscriptions() {
        return subscriptionJpaRepository.findActiveSubscriptions();
    }

    @Override
    public List<Subscription> findCancelledSubscriptions() {
        return subscriptionJpaRepository.findCancelledSubscriptions();
    }

    @Override
    public List<Subscription> findByCustomerId(Long customerId) {
        return subscriptionJpaRepository.findByCustomerId(customerId);
    }

    @Override
    public List<Subscription> findByApplicationId(Long applicationId) {
        return subscriptionJpaRepository.findByApplicationId(applicationId);
    }

    @Override
    public List<Subscription> findAll() {
        return subscriptionJpaRepository.findAll();
    }
}
