package com.tfprojarq.tfprojarq.domain.useCases;

import java.util.List;

import com.tfprojarq.tfprojarq.domain.entities.Application;

public interface ListApplicationsUseCase {
    List<Application> listAll();
}
