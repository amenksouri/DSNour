package com.example.demo.serviceImpl;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import com.example.demo.models.UniversiteModel;
import com.example.demo.services.universiteService;
import com.example.demo.repository.loyerRepository;
import com.example.demo.repository.universiteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class universiteServiceImpl implements universiteService {

	@Override
	public List<UniversiteModel> retrieveAllUniversites() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UniversiteModel addUniversite(UniversiteModel u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UniversiteModel updateUniversite(UniversiteModel u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UniversiteModel retrieveUniversite(long idUniversite) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeUniversite(long idUniversite) {
		// TODO Auto-generated method stub
		
	}
  
}