package com.xworkz.dto.serviceimpl;

import com.xworkz.dto.app.AadharDTO;
import com.xworkz.dto.app.repository.AadharDTORepository;
import com.xworkz.dto.service.AadharService;

public class AadharServiceImpl implements AadharService {

	private AadharDTORepository aadharDTORepository;
	private int position;

	public AadharServiceImpl(AadharDTORepository aadharDTORepository) {
		this.aadharDTORepository = aadharDTORepository;
	}
	
	@Override
	public boolean validateAndSave(AadharDTO dto) {
		if(AadharDTO ! = null) {
			long number = AadharDTO.getNumber();
			
		}
			
			
		return false;
	}

}
