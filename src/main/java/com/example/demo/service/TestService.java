package com.example.demo.service;

import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.example.demo.entities.EntityA;
import com.example.demo.repository.EntityARepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TestService {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private EntityARepository entityARepository;

    @Transactional
    @PostConstruct
    private void initialize() {
        EntityA entityA = new EntityA();
        entityA.setName("Hello!");

        // entityARepository.save(entityA);
        entityManager.persist(entityA);
    }
}
