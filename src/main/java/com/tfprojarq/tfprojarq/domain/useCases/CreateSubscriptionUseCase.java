package com.tfprojarq.tfprojarq.domain.useCases;

import com.tfprojarq.tfprojarq.domain.entities.Subscription;

public interface CreateSubscriptionUseCase {
    Subscription create(Long customerId, Long applicationId);
}