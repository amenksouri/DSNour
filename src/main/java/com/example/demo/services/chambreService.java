package com.example.demo.services;

import java.util.List;

import com.example.demo.models.ChambreModel;



public interface chambreService {
	
	List<ChambreModel> retrieveAllChambres();
	ChambreModel addChambre(ChambreModel c);
	ChambreModel updateChambre(ChambreModel b);
	ChambreModel retrieveChambre(long id);
    void removeChambre(long id);

}
