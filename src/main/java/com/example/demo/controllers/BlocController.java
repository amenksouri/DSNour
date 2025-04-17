package com.example.demo.controllers;

import com.example.demo.models.BlocModel;

import com.example.demo.services.BlocServices;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/blocs")
@RequiredArgsConstructor
public class BlocController {

	@Autowired
    private  BlocServices blocService;  

    @GetMapping("/all")
    public List<BlocModel> getAllBlocs() {
        return blocService.retrieveAllBlocs();
    }

    @GetMapping("/{id}")
    public BlocModel getBlocById(@PathVariable long id) {  
        return blocService.retrieveBloc(id);
    }

    @PostMapping("/add")
    public BlocModel addBloc(@RequestBody BlocModel bloc) {
        return blocService.addBloc(bloc);
    }
    @PutMapping("/update/{id}")
    public BlocModel updateBloc(@RequestBody BlocModel bloc) {
    	return blocService.updateBloc(bloc);
    }
   
    
    @DeleteMapping("/{id}")
    public void deleteBloc(@PathVariable long id) {
    	blocService.removeBloc(id);
    }
    
    
    
}  