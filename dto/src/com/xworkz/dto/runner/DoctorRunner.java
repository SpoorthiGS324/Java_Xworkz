package com.xworkz.dto.runner;

import com.xworkz.dto.app.DoctorDTO;
import com.xworkz.dto.app.repository.DoctorRepository;
import com.xworkz.dto.app.repositoryimpl.DoctorRepositoryImpl;
import com.xworkz.dto.service.DoctorService;
import com.xworkz.dto.serviceimpl.DoctorServiceImpl;

public class DoctorRunner {

	public static void main(String[] args) {

		DoctorRepository doctorRepository = new DoctorRepositoryImpl();

		DoctorService doctorService = new DoctorServiceImpl(doctorRepository);

		DoctorDTO doctorDTO = new DoctorDTO("Spoodeepak", "Heart", 3, 100);

		DoctorDTO doctorDTO2 = new DoctorDTO(null, null, 0, 0);

		DoctorDTO doctorDTO3 = new DoctorDTO("deepu", "Eye", 0, 0);

		DoctorDTO doctorDTO4 = new DoctorDTO(null, null, 2, 200);

		DoctorDTO doctorDTO5 = new DoctorDTO("maanya", "Head", 5, 200);

		doctorService.saveAndValidate(doctorDTO);
		System.out.println();

		doctorService.saveAndValidate(doctorDTO2);
		System.out.println();

		doctorService.saveAndValidate(doctorDTO3);
		System.out.println();

		doctorService.saveAndValidate(doctorDTO4);
		System.out.println();

		doctorService.saveAndValidate(doctorDTO5);
	}
	}


