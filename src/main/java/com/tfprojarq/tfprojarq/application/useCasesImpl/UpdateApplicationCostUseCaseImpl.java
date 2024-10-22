package com.tfprojarq.tfprojarq.application.useCasesImpl;

import com.tfprojarq.tfprojarq.domain.entities.Application;
import com.tfprojarq.tfprojarq.domain.repositories.ApplicationRepository;
import com.tfprojarq.tfprojarq.domain.useCases.UpdateApplicationCostUseCase;


public class UpdateApplicationCostUseCaseImpl implements UpdateApplicationCostUseCase {

    private final ApplicationRepository applicationRepository;

    public UpdateApplicationCostUseCaseImpl(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    @Override
    public Application updateCost(Long applicationId, double newCost) {
        Application application = applicationRepository.findById(applicationId)
                .orElseThrow(() -> new IllegalArgumentException("Application not found"));

        application.setMonthlyCost(newCost);
        return applicationRepository.save(application);
    }
}
