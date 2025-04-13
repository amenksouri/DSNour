package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.BlocModel;

public interface blocRepository extends JpaRepository<BlocModel, Long> {

}
