package com.tfprojarq.tfprojarq.domain.useCases;

import java.util.List;

import com.tfprojarq.tfprojarq.domain.entities.Subscription;

public interface ListCustomerSubscriptionsUseCase {
    List<Subscription> listByCustomer(Long customerId);
}
