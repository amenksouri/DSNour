package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.ReservationModel;
import com.example.demo.repository.reservaRepo;

import com.example.demo.services.reservationService;


@Service
public class resercationServiceImpl implements reservationService {

	@Autowired
	private reservaRepo reserRepo;
	@Override
	public List<ReservationModel> getAllReservation() {
		// TODO Auto-generated method stub
		return reserRepo.findAll();
	}

	@Override
	public ReservationModel addReservation(ReservationModel b) {
		// TODO Auto-generated method stub
		return reserRepo.save(b);
	}

	@Override
	public ReservationModel updateReservation(ReservationModel b) {
		// TODO Auto-generated method stub
		return reserRepo.save(b);
	}

	@Override
	public ReservationModel retrieveReservation(long id) {
		// TODO Auto-generated method stub
		Optional<ReservationModel> op = reserRepo.findById(id);
        if(op.isPresent())
        {
            return op.get();
        }
        else
        {
            throw new NullPointerException("Reservetion model avec l'Id "+ id+"n'existe pas");
        }
	}

	@Override
	public void removeReservation(long id) {
		// TODO Auto-generated method stub
		reserRepo.deleteById(id);
	}

		
	

}
