package com.xworkz.Repository.app.service;

import com.xworkz.Repository.app.Medicine;

public class MedicineServiceImpl implements MedicineService {
	
	private Medicine medicine;
	public MedicineServiceImpl(Medicine medicine) {
		this.medicine=medicine;
	}
	
	@Override
	public boolean list(String names) {
		System.out.println("invoking validate and save "+this.getClass().getSimpleName());
		if(names!=null && !names.isEmpty() && names.length()>=3 && names.length()>=0)
		{
			System.out.println("Medicine names is valid..");
			this.medicine.cure(names);
		}
		else
		{
			System.err.println("Medicine names is invalid, cannot save..");
		}
	
		return false;
	}

}
