package com.example.demo.serviceImpl;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import com.example.demo.models.BlocModel;
import com.example.demo.models.UniversiteModel;
import com.example.demo.services.universiteService;
import com.example.demo.repository.loyerRepository;
import com.example.demo.repository.universiteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class universiteServiceImpl implements universiteService {

	@Autowired
	private universiteRepository universiteRepo;
	@Override
	public List<UniversiteModel> retrieveAllUniversites() {
		// TODO Auto-generated method stub
		return universiteRepo.findAll();
	}

	@Override
	public UniversiteModel addUniversite(UniversiteModel u) {
		// TODO Auto-generated method stub
		return universiteRepo.save(u);
	}

	@Override
	public UniversiteModel updateUniversite(UniversiteModel u) {
		// TODO Auto-generated method stub
		return universiteRepo.save(u);
	}

	@Override
	public UniversiteModel retrieveUniversite(long idUniversite) {
		Optional<UniversiteModel> op = universiteRepo.findById(idUniversite);
        if(op.isPresent())
        {
            return op.get();
        }
        else
        {
            throw new NullPointerException("universitekmodel avec l'Id "+ idUniversite +"n'existe pas");
        }
	}

	@Override
	public void removeUniversite(long idUniversite) {
		// TODO Auto-generated method stub
		universiteRepo.deleteById(idUniversite);	}
  
}