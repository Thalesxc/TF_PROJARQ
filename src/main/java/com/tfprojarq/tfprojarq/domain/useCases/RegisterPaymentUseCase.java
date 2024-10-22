package com.tfprojarq.tfprojarq.domain.useCases;

import com.tfprojarq.tfprojarq.domain.entities.Payment;

public interface RegisterPaymentUseCase {
    Payment registerPayment(Long subscriptionId, double amountPaid, int day, int month, int year);
}
