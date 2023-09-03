package com.xworkz.Repository.app.impl;

import com.xworkz.Repository.app.Patient;

public class PatientImpl implements Patient{

	private String[] nam = new String[TOTAL_ITEMS];
	private int position;
	
	@Override
	public void sleep(String patientname) {
		if(position < TOTAL_ITEMS) {
			this.nam[position]=patientname;
			System.out.println("stored "+patientname +"is in the position"+this.position);
			this.position++;
		}else {
			System.err.println("storage is full");
		}
		
		
	}

}
