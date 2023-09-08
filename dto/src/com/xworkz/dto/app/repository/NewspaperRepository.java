package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.NewspaperDTO;

public interface NewspaperRepository {

	int TOTAL_ITEMS=5;
	void save(NewspaperDTO dto);
	
	
}
