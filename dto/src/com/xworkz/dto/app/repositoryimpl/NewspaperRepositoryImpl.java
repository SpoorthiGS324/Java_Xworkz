package com.xworkz.dto.app.repositoryimpl;

import com.xworkz.dto.app.NewspaperDTO;
import com.xworkz.dto.app.repository.NewspaperRepository;

public class NewspaperRepositoryImpl implements NewspaperRepository {

	
	private NewspaperDTO[] dtos = new NewspaperDTO[TOTAL_ITEMS];
	private int position;
	
	@Override
	public void save(NewspaperDTO dto) {
	
		System.out.println("invoking main save in NewspaperRepositoryImpl");
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
