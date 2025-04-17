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

import com.example.demo.models.BlocModel;
import com.example.demo.models.ChambreModel;
import com.example.demo.services.chambreService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/chambres")
@RequiredArgsConstructor
public class chambreController {

	@Autowired
	private  chambreService chambreService;
	 @GetMapping("/all")
	    public List<ChambreModel> getAllChambres() {
	        return chambreService.retrieveAllChambres();
	    }

	    @GetMapping("/{id}")
	    public ChambreModel getChambreById(@PathVariable long id) {  
	        return chambreService.retrieveChambre(id);
	    }

	    @PostMapping("/add")
	    public ChambreModel addChambre(@RequestBody ChambreModel chambre) {
	        return chambreService.addChambre(chambre);
	    }
	    @PutMapping("/update/{id}")
	    public ChambreModel updateChambre(@RequestBody ChambreModel bloc) {
	    	return chambreService.updateChambre(bloc);
	    }
	    
	    @DeleteMapping("/delete/{id}")
	    public void deleteChambre(@PathVariable long id) {
	    	chambreService.removeChambre(id);
	    }
}
