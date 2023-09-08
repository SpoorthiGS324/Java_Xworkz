package com.xworkz.dto.runner;

import com.xworkz.dto.app.PrinterDTO;
import com.xworkz.dto.app.repository.PrinterRepository;
import com.xworkz.dto.app.repositoryimpl.PrinterRepositoryImpl;
import com.xworkz.dto.service.PrinterService;
import com.xworkz.dto.serviceimpl.PrinterServiceImpl;

public class PrinterRunner {

	public static void main(String[] args) {

		PrinterRepository printerRepository = new PrinterRepositoryImpl();

		PrinterService printerService = new PrinterServiceImpl(printerRepository);

		PrinterDTO dto = new PrinterDTO("Lenovo", "Medium", 3);

		PrinterDTO dto2 = new PrinterDTO("Dell", "Small", 0);

		PrinterDTO dto3 = new PrinterDTO(null, null, 5);

		PrinterDTO dto4 = new PrinterDTO(null, null, 0);

		PrinterDTO dto5 = new PrinterDTO("Asus", "Large", 6);

		printerService.saveAndValidate(dto);

		printerService.saveAndValidate(dto2);

		printerService.saveAndValidate(dto3);

		printerService.saveAndValidate(dto4);

		printerService.saveAndValidate(dto5);

	}
}


