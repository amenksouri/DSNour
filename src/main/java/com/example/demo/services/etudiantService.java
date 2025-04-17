package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.EtudiantModel;
@Service
public interface etudiantService {
	 List<EtudiantModel> getAllEtudiants();
	    EtudiantModel addEtudiant(EtudiantModel e);
	    EtudiantModel updateEtudiant(EtudiantModel e);
	    EtudiantModel getEtudiantById(long id);
	    void removeEtudiant(long id);
}
