package com.example.demo.serviceImpl;



import com.example.demo.models.BlocModel;
import com.example.demo.models.ChambreModel;
import com.example.demo.repository.blocRepository;
import com.example.demo.repository.chambreRepository;
import com.example.demo.services.BlocServices;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class blocServiceImpl implements BlocServices {

	@Autowired
	private blocRepository blocRepo ;
	
	@Override
	public List<BlocModel> retrieveAllBlocs() {
		// TODO Auto-generated method stub
		return blocRepo.findAll() ;
	}

	@Override
	public BlocModel addBloc(BlocModel b) {
		// TODO Auto-generated method stub
		return blocRepo.save(b);
	}

	@Override
	public BlocModel updateBloc(BlocModel b) {
		// TODO Auto-generated method stub
		return blocRepo.save(b);
	}

	@Override
	public BlocModel retrieveBloc(long idBloc) {
		// TODO Auto-generated method stub
		Optional<BlocModel> op = blocRepo.findById(idBloc);
        if(op.isPresent())
        {
            return op.get();
        }
        else
        {
            throw new NullPointerException("blockmodel avec l'Id "+ idBloc +"n'existe pas");
        }
	}

	@Override
	public void removeBloc(long idBloc) {
		// TODO Auto-generated method stub
		blocRepo.deleteById(idBloc);
		
	}
	
    
}