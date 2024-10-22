package com.tfprojarq.tfprojarq.application.useCasesImpl;

import java.time.LocalDate;

import com.tfprojarq.tfprojarq.domain.entities.Subscription;
import com.tfprojarq.tfprojarq.domain.repositories.SubscriptionRepository;
import com.tfprojarq.tfprojarq.domain.useCases.CheckSubscriptionStatusUseCase;

public class CheckSubscriptionStatusUseCaseImpl implements CheckSubscriptionStatusUseCase {

    private final SubscriptionRepository subscriptionRepository;

    public CheckSubscriptionStatusUseCaseImpl(SubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    @Override
    public boolean isActive(Long subscriptionId) {
        Subscription subscription = subscriptionRepository.findById(subscriptionId)
                .orElseThrow(() -> new IllegalArgumentException("Subscription not found"));

        return subscription.getEndDate().isAfter(LocalDate.now());
    }
}