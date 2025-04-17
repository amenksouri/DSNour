package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.EtudiantModel;
import com.example.demo.repository.etudiantRepository;
import com.example.demo.services.etudiantService;

@Service
public class etudiantServiceImpl implements etudiantService {

	@Autowired
	private etudiantRepository etudiantRepo;
	
	@Override
	public List<EtudiantModel> getAllEtudiants() {
		// TODO Auto-generated method stub
		return etudiantRepo.findAll();
	}

	@Override
	public EtudiantModel addEtudiant(EtudiantModel e) {
		// TODO Auto-generated method stub
		return etudiantRepo.save(e);
	}

	@Override
	public EtudiantModel updateEtudiant(EtudiantModel e) {
		// TODO Auto-generated method stub
		return etudiantRepo.save(e);
	}

	@Override
	public EtudiantModel getEtudiantById(long id) {
		// TODO Auto-generated method stub
		Optional<EtudiantModel> op = etudiantRepo.findById(id);
        if(op.isPresent())
        {
            return op.get();
        }
        else
        {
            throw new NullPointerException("etudiant model avec l'Id "+ id +"n'existe pas");
        }
	}

	@Override
	public void removeEtudiant(long id) {
		// TODO Auto-generated method stub
		etudiantRepo.deleteById(id);
	}

}
