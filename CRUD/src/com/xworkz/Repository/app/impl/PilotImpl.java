package com.xworkz.Repository.app.impl;

import com.xworkz.Repository.app.Pilot;

public class PilotImpl implements Pilot{

	private String[] nam = new String[TOTAL_ITEMS];
	private int position;
	@Override
	public void fly(String name) {
		if(position < TOTAL_ITEMS) {
			this.nam[position]=name;
			System.out.println("stored "+name +"is in the position"+this.position);
			this.position++;
		}else {
			System.err.println("storage is full");
		}
		
		
	}
	
}
