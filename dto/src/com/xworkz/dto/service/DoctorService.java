package com.xworkz.dto.service;

import com.xworkz.dto.app.DoctorDTO;

public interface DoctorService {

	boolean saveAndValidate(DoctorDTO doctorDTO);
}
