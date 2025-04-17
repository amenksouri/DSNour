package com.example.demo.controllers;
import com.example.demo.models.UniversiteModel;
import com.example.demo.services.universiteService;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/universites")
@RequiredArgsConstructor
public class universiteController {
	@Autowired
    private  universiteService universiteService;

    @GetMapping("/all")
    public List<UniversiteModel> getAllUniversites() {
        return universiteService.retrieveAllUniversites();
    }

    @GetMapping("/{id}")
    public UniversiteModel getUniversiteById(@PathVariable long id) {
        return universiteService.retrieveUniversite(id);
    }

    @PostMapping("/add")
    public UniversiteModel addUniversite(@RequestBody UniversiteModel universite) {
        return universiteService.addUniversite(universite);
    }

    @PutMapping("/update")
    public UniversiteModel updateUniversite(@RequestBody UniversiteModel universite) {
        return universiteService.updateUniversite(universite);
    }

    @DeleteMapping("/{id}")
    public void deleteUniversite(@PathVariable long id) {
        universiteService.removeUniversite(id);
    }
}