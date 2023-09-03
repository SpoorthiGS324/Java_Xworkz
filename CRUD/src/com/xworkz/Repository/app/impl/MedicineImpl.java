package com.xworkz.Repository.app.impl;

import com.xworkz.Repository.app.Medicine;

public class MedicineImpl implements Medicine{
	private String[] nam = new String[TOTAL_ITEMS];
	private int position;
	
	@Override
	public void cure (String name) {
		if(position < TOTAL_ITEMS) {
			this.nam[position]=name;
			System.out.println("stored "+name +"is in the position"+this.position);
			this.position++;
		}else {
			System.err.println("storage is full");
		}
				
	}
	
}
