package com.example.demo.serviceImpl;
import com.example.demo.models.BlocModel;
import com.example.demo.models.ChambreModel;
import com.example.demo.repository.blocRepository;
import com.example.demo.repository.chambreRepository;
import com.example.demo.services.BlocServices;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class blocServiceImpl implements BlocServices {

	@Override
	public List<BlocModel> retrieveAllBlocs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlocModel addBloc(BlocModel b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlocModel updateBloc(BlocModel b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlocModel retrieveBloc(long idBloc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeBloc(long idBloc) {
		// TODO Auto-generated method stub
		
	}
    
}