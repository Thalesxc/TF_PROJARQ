package com.tfprojarq.tfprojarq.application.useCasesImpl;

import java.util.List;

import com.tfprojarq.tfprojarq.domain.entities.Application;
import com.tfprojarq.tfprojarq.domain.repositories.ApplicationRepository;
import com.tfprojarq.tfprojarq.domain.useCases.ListApplicationsUseCase;

public class ListApplicationsUseCaseImpl implements ListApplicationsUseCase {

    private final ApplicationRepository applicationRepository;

    public ListApplicationsUseCaseImpl(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    @Override
    public List<Application> listAll() {
        return applicationRepository.findAll();
    }
}
