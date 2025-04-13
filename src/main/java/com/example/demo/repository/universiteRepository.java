package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.UniversiteModel;

public interface universiteRepository extends JpaRepository<UniversiteModel,Long> {

}
