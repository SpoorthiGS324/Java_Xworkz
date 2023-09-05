package com.xworkz.Repository.app.service;

import com.xworkz.Repository.app.Patient;

public class PatientServiceImpl implements PatientService {
	private Patient patient;

	public PatientServiceImpl(Patient patient) {
		this.patient=patient;
	}
	@Override
	public boolean care(String names) {
		System.out.println("invoking validate and save "+this.getClass().getSimpleName());
		if(names!=null && !names.isEmpty() && names.length()>=3 && names.length()>=0)
		{
			System.out.println("Patient names is valid..");
			this.patient.care(names);
		}
		else
		{
			System.err.println("Patient names is invalid, cannot save..");
		}

		return false;
	}

}
