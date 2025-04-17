package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.ReservationModel;

public interface reservationService {

	  List<ReservationModel> getAllReservation();
	  ReservationModel addReservation(ReservationModel b);
	    ReservationModel updateReservation(ReservationModel b);
	    ReservationModel retrieveReservation(long id);
	    void removeReservation(long id);
}
