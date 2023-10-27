package com.xworkz.dto1.Repository.app;

import com.xworkz.dto1.app.EngineerDTO;

public interface EngineerDTORepository {

	int TOTAL_ITEMS = 5;

	void save(EngineerDTO dto);

	default boolean IsExist(String name) {

		return false;
		
		
		

	}
}
