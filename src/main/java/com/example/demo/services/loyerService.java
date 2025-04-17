package com.example.demo.services;

import java.util.List;


import com.example.demo.models.LoyerModel;

public interface loyerService {
	
	
	List<LoyerModel>  getAllFoyer();
	LoyerModel addFoyer(LoyerModel f);
	LoyerModel updateFoyer(LoyerModel b);
	LoyerModel getFoyerById(long idFoyer);
	    void deleteFoyer(long idFoyer);

}
