package com.tfprojarq.tfprojarq.adapters.repostioriesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tfprojarq.tfprojarq.adapters.repositoriesJPA.ApplicationJpaRepository;
import com.tfprojarq.tfprojarq.domain.entities.Application;
import com.tfprojarq.tfprojarq.domain.repositories.ApplicationRepository;

@Repository
public class ApplicationRepositoryImpl implements ApplicationRepository {

    private final ApplicationJpaRepository applicationJpaRepository;

    @Autowired
    public ApplicationRepositoryImpl(ApplicationJpaRepository applicationJpaRepository) {
        this.applicationJpaRepository = applicationJpaRepository;
    }

    @Override
    public Optional<Application> findById(Long id) {
        return applicationJpaRepository.findById(id);
    }

    @Override
    public Application save(Application application) {
        return applicationJpaRepository.save(application);
    }

    @Override
    public void deleteById(Long id) {
        applicationJpaRepository.deleteById(id);
    }

    @Override
    public List<Application> findAll() {
        return applicationJpaRepository.findAll();
    }
}
