package com.tfprojarq.tfprojarq.application.useCasesImpl;

import java.util.List;

import com.tfprojarq.tfprojarq.domain.entities.Subscription;
import com.tfprojarq.tfprojarq.domain.repositories.SubscriptionRepository;
import com.tfprojarq.tfprojarq.domain.useCases.ListApplicationSubscriptionsUseCase;

public class ListApplicationSubscriptionsUseCaseImpl implements ListApplicationSubscriptionsUseCase {

    private final SubscriptionRepository subscriptionRepository;

    public ListApplicationSubscriptionsUseCaseImpl(SubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    @Override
    public List<Subscription> listByApplication(Long applicationId) {
        return subscriptionRepository.findByApplicationId(applicationId);
    }
}