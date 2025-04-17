package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.models.ReservationModel;
import com.example.demo.services.reservationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/reser")
@RequiredArgsConstructor
public class reservationController {
@Autowired
private reservationService reserSer;

@GetMapping("/all")
public List<ReservationModel> getAllreservations() {
    return reserSer.getAllReservation();
}

@GetMapping("/{id}")
public ReservationModel getReservesionById(@PathVariable long id) {  
    return reserSer.retrieveReservation(id);
}

@PostMapping("/add")
public ReservationModel addReservation(@RequestBody ReservationModel reservation) {
    return reserSer.addReservation(reservation);
}
@PutMapping("/update/{id}")
public ReservationModel updateReservation(@RequestBody ReservationModel reservation) {
	return reserSer.updateReservation(reservation);
}


@DeleteMapping("/delete/{id}")
public void deleteReservation(@PathVariable long id) {
	reserSer.removeReservation(id);
}


}
