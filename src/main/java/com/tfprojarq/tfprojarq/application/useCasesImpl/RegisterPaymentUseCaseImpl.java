package com.tfprojarq.tfprojarq.application.useCasesImpl;

import java.time.LocalDate;

import com.tfprojarq.tfprojarq.domain.entities.Payment;
import com.tfprojarq.tfprojarq.domain.entities.Subscription;
import com.tfprojarq.tfprojarq.domain.repositories.PaymentRepository;
import com.tfprojarq.tfprojarq.domain.repositories.SubscriptionRepository;
import com.tfprojarq.tfprojarq.domain.useCases.CheckSubscriptionStatusUseCase;
import com.tfprojarq.tfprojarq.domain.useCases.RegisterPaymentUseCase;

public class RegisterPaymentUseCaseImpl implements RegisterPaymentUseCase {

    private final PaymentRepository paymentRepository;
    private final SubscriptionRepository subscriptionRepository;
    private final CheckSubscriptionStatusUseCase checkSubscriptionStatusUseCase;

    public RegisterPaymentUseCaseImpl(
            PaymentRepository paymentRepository,
            SubscriptionRepository subscriptionRepository,
            CheckSubscriptionStatusUseCase checkSubscriptionStatusUseCase) {
        this.paymentRepository = paymentRepository;
        this.subscriptionRepository = subscriptionRepository;
        this.checkSubscriptionStatusUseCase = checkSubscriptionStatusUseCase;
    }

    @Override
    public Payment registerPayment(Long subscriptionId, double amountPaid, int day, int month, int year) {
        Subscription subscription = subscriptionRepository.findById(subscriptionId)
                .orElseThrow(() -> new IllegalArgumentException("Subscription not found"));

        LocalDate paymentDate = LocalDate.of(year, month, day);

        // Check if the subscription is active
        boolean isActive = checkSubscriptionStatusUseCase.isActive(subscriptionId);
        LocalDate newEndDate;

        if (!isActive) {
            newEndDate = paymentDate.plusDays(30); // Reactivating subscription
        } else {
            newEndDate = subscription.getEndDate().plusDays(30); // Extending validity
        }

        subscription.setEndDate(newEndDate);
        subscriptionRepository.save(subscription);

        Long paymentId = null;

        Payment payment = new Payment(paymentId, subscription, amountPaid, paymentDate);
        return paymentRepository.save(payment);
    }
}
