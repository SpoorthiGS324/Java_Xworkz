package com.xworkz.dto.runner;

import com.xworkz.dto.app.NewspaperDTO;
import com.xworkz.dto.app.repository.NewspaperRepository;
import com.xworkz.dto.app.repositoryimpl.NewspaperRepositoryImpl;
import com.xworkz.dto.service.NewspaperService;
import com.xworkz.dto.serviceimpl.NewspaperServiceImpl;

public class NewspaperRunner {

	public static void main(String[] args) {

		NewspaperRepository repo = new NewspaperRepositoryImpl();
		NewspaperService service = new NewspaperServiceImpl(repo);
		NewspaperDTO dto = new NewspaperDTO();
		boolean persisted =service.validateAndSave(dto);
		System.out.println("persisted"+persisted);
	
		NewspaperDTO dto1 = new NewspaperDTO("Times of india");
		service.saveAndValidate(dto1);
	
	}

}
