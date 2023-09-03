package com.xworkz.Repository.app.impl;

import com.xworkz.Repository.app.PoliticanRepository;

public class PoliticanRepositoryImpl implements PoliticanRepository{

	private String[] des = new String[TOTAL_ITEMS];
	private int position;
	@Override
	public void help(String designation) {

		if(position < TOTAL_ITEMS) {
			this.des[position]=designation;
			System.out.println("stored "+designation +"is in the position"+this.position);
			this.position++;
		}else {
			System.err.println("storage is full");
		}
		
	}
	
}
