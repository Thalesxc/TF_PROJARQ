package com.tfprojarq.tfprojarq.domain.entities;

import java.time.LocalDate;

public class Subscription {
    private Long id;
    private Application application;
    private Customer customer;
    private LocalDate startDate;
    private LocalDate endDate;

    public Subscription(Long id, Application application, Customer customer, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.application = application;
        this.customer = customer;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "id=" + id +
                ", application=" + application +
                ", customer=" + customer +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}