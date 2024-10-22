package com.tfprojarq.tfprojarq.domain.useCases;

import com.tfprojarq.tfprojarq.domain.entities.Application;

public interface UpdateApplicationCostUseCase {
    Application updateCost(Long applicationId, double newCost);
}