package com.tfprojarq.tfprojarq.domain.entities;

import java.time.LocalDate;

public class Payment {
    private Long id;
    private Subscription subscription;
    private double amountPaid;
    private LocalDate paymentDate;

    public Payment(Long id, Subscription subscription, double amountPaid, LocalDate paymentDate) {
        this.id = id;
        this.subscription = subscription;
        this.amountPaid = amountPaid;
        this.paymentDate = paymentDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }


    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", subscription=" + subscription +
                ", amountPaid=" + amountPaid +
                ", paymentDate=" + paymentDate +
                '}';
    }
}
