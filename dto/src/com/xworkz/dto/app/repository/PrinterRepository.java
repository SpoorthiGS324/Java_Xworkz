package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.PrinterDTO;

public interface PrinterRepository {

	int TOTAL_SIZE = 5;

	void save(PrinterDTO dto);
	
	
}
