package com.xworkz.dto.app.repositoryimpl;

import com.xworkz.dto.app.AadharDTO;
import com.xworkz.dto.app.repository.AadharDTORepository;

public class AadharDTORepositoryImpl implements AadharDTORepository {

	private AadharDTO[] dtos = new AadharDTO[TOTAL_ITEMS];
	private int position;
	
	
	@Override
	public void save(AadharDTO dto) {
		System.out.println("invoking main save in AadharDTORepositoryImpl");
		if(position < TOTAL_ITEMS) {
			this.dtos[position] = dto;
			System.out.println("stored"+dto+ "is in position"+this.position);
			this.position++;
					}
		else {
			System.err.println("storage is full");
	}

		
	}

}
