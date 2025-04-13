package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.EtudiantModel;

public interface etudiantRepository extends JpaRepository<EtudiantModel, Long> {

}
