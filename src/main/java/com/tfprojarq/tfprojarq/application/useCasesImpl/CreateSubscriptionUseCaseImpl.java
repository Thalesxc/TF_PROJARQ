package com.tfprojarq.tfprojarq.application.useCasesImpl;

import java.time.LocalDate;

import com.tfprojarq.tfprojarq.domain.entities.Application;
import com.tfprojarq.tfprojarq.domain.entities.Customer;
import com.tfprojarq.tfprojarq.domain.entities.Subscription;
import com.tfprojarq.tfprojarq.domain.repositories.ApplicationRepository;
import com.tfprojarq.tfprojarq.domain.repositories.CustomerRepository;
import com.tfprojarq.tfprojarq.domain.repositories.SubscriptionRepository;
import com.tfprojarq.tfprojarq.domain.useCases.CreateSubscriptionUseCase;


public class CreateSubscriptionUseCaseImpl implements CreateSubscriptionUseCase {

    private final SubscriptionRepository subscriptionRepository;
    private final ApplicationRepository applicationRepository;
    private final CustomerRepository customerRepository;

    public CreateSubscriptionUseCaseImpl(SubscriptionRepository subscriptionRepository, ApplicationRepository applicationRepository, CustomerRepository customerRepository) {
        this.subscriptionRepository = subscriptionRepository;
        this.applicationRepository = applicationRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public Subscription create(Long customerId, Long applicationId) {
        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new IllegalArgumentException("Customer not found"));
        Application application = applicationRepository.findById(applicationId)
                .orElseThrow(() -> new IllegalArgumentException("Application not found"));

        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.plusDays(7);

        Long subscriptionId = null;

        Subscription subscription = new Subscription(subscriptionId, application, customer, startDate, endDate);

        return subscriptionRepository.save(subscription);
    }
}
