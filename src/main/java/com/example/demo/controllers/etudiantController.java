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

import com.example.demo.models.EtudiantModel;
import com.example.demo.services.etudiantService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/etudiant")
@RequiredArgsConstructor
public class etudiantController {

	@Autowired
	private etudiantService etudiantService;
	
	 @GetMapping("/all")
	    public List<EtudiantModel> getAllEtudiant() {
	        return etudiantService.getAllEtudiants();
	    }

	    @GetMapping("/{id}")
	    public EtudiantModel getEtudiantById(@PathVariable long id) {  
	        return etudiantService.getEtudiantById(id);
	    }

	    @PostMapping("/add")
	    public EtudiantModel addEtudiant(@RequestBody EtudiantModel etudiant) {
	        return etudiantService.addEtudiant(etudiant);
	    }
	    @PutMapping("/update/{id}")
	    public EtudiantModel updateEtudiant(@RequestBody EtudiantModel etudiant) {
	    	return etudiantService.updateEtudiant(etudiant);
	    }
	    
	    @DeleteMapping("/delete/{id}")
	    public void deleteEtudiant(@PathVariable long id) {
	    	etudiantService.removeEtudiant(id);
	    }
	
	
	
	
}
