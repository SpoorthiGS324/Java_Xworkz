package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.DoctorDTO;

public interface DoctorRepository {

	int COUNT = 5;

	void saveDoctorInfo(DoctorDTO doctorDTO);
}
