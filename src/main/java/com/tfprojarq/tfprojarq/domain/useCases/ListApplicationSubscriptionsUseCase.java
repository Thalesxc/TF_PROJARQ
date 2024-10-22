package com.tfprojarq.tfprojarq.domain.useCases;

import java.util.List;

import com.tfprojarq.tfprojarq.domain.entities.Subscription;

public interface ListApplicationSubscriptionsUseCase {
    List<Subscription> listByApplication(Long applicationId);
}
