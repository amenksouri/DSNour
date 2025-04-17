package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.ChambreModel;
import com.example.demo.repository.chambreRepository;
import com.example.demo.services.chambreService;

@Service
public class chambreServiceImpl implements chambreService {

	@Autowired
	private chambreRepository chambreRepository;
	@Override
	public List<ChambreModel> retrieveAllChambres() {
		// TODO Auto-generated method stub
		return chambreRepository.findAll();
	}

	@Override
	public ChambreModel addChambre(ChambreModel c) {
		// TODO Auto-generated method stub
		return chambreRepository.save(c);
	}

	@Override
	public ChambreModel updateChambre(ChambreModel c) {
		// TODO Auto-generated method stub
		return chambreRepository.save(c);
	}

	@Override
	public ChambreModel retrieveChambre(long id) {
		// TODO Auto-generated method stub
		Optional<ChambreModel> op = chambreRepository.findById(id);
        if(op.isPresent())
        {
            return op.get();
        }
        else
        {
            throw new NullPointerException("blockmodel avec l'Id "+ id +"n'existe pas");
        }
	}

	@Override
	public void removeChambre(long id) {
		// TODO Auto-generated method stub
		chambreRepository.deleteById(id);
	}

}
