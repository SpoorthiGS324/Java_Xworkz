package com.xworkz.dto.service;

import com.xworkz.dto.app.PrinterDTO;

public interface PrinterService {

	boolean saveAndValidate(PrinterDTO dto);
	
}
