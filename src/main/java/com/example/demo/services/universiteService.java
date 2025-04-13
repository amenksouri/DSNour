package com.example.demo.services;
import com.example.demo.models.UniversiteModel;
import java.util.List;

public interface universiteService {
    List<UniversiteModel> retrieveAllUniversites();
    UniversiteModel addUniversite(UniversiteModel u);
    UniversiteModel updateUniversite(UniversiteModel u);
    UniversiteModel retrieveUniversite(long idUniversite);
    void removeUniversite(long idUniversite);
}