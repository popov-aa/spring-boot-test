package com.example.demo.repository;

import com.example.demo.entities.EntityA;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EntityARepository extends JpaRepository<EntityA,Long> {
    
}
