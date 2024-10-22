package com.tfprojarq.tfprojarq.domain.useCases;

public interface CheckSubscriptionStatusUseCase {
    boolean isActive(Long subscriptionId);
}