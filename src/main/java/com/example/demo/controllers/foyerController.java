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


import com.example.demo.models.LoyerModel;
import com.example.demo.services.loyerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/foyer")
@RequiredArgsConstructor
public class foyerController {
@Autowired
private loyerService foyerService;


@GetMapping("/all")
public List<LoyerModel> getAllFoyers() {
    return foyerService.getAllFoyer();
}

@GetMapping("/{id}")
public LoyerModel getFoyerById(@PathVariable long id) {  
    return foyerService.getFoyerById(id);
}

@PostMapping("/add")
public LoyerModel addFoyer(@RequestBody LoyerModel foyer) {
    return foyerService.addFoyer(foyer);
}

@PutMapping("/update/{id}")
public LoyerModel updateFoyer( @RequestBody LoyerModel foyer) {
    return foyerService.updateFoyer( foyer);
   
}

@DeleteMapping("/delete/{idFoyer}")
public void deleteFoyer(@PathVariable long idFoyer) {
	foyerService.deleteFoyer(idFoyer);
}


}
