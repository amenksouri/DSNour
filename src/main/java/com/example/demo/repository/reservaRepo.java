package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.ReservationModel;

public interface reservaRepo extends JpaRepository<ReservationModel, Long> {

}
