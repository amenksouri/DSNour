package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.ChambreModel;

public interface chambreRepository extends JpaRepository<ChambreModel, Long> {

}
