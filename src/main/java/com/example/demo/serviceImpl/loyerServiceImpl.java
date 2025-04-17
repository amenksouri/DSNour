package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.LoyerModel;
import com.example.demo.repository.loyerRepository;
import com.example.demo.services.loyerService;
@Service
public class loyerServiceImpl implements loyerService {

	@Autowired
	private loyerRepository FoyerRepo;
	
	@Override
	public List<LoyerModel> getAllFoyer() {
		// TODO Auto-generated method stub
		return FoyerRepo.findAll();
	}

	@Override
	public LoyerModel addFoyer(LoyerModel f) {
		// TODO Auto-generated method stub
		return FoyerRepo.save(f);
	}

	@Override
	public LoyerModel updateFoyer(LoyerModel f) {
		// TODO Auto-generated method stub
		return FoyerRepo.save(f);
	}

	@Override
	public LoyerModel getFoyerById(long idFoyer) {
		// TODO Auto-generated method stub
		Optional<LoyerModel> op = FoyerRepo.findById(idFoyer);
        if(op.isPresent())
        {
            return op.get();
        }
        else
        {
            throw new NullPointerException("Foyer model avec l'Id "+ idFoyer+"n'existe pas");
        }
	}

	@Override
	public void deleteFoyer(long idFoyer) {
		// TODO Auto-generated method stub
		FoyerRepo.deleteById(idFoyer);
		
	}

}
