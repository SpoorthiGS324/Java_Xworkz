package com.xworkz.Repository.app.impl;

import com.xworkz.Repository.app.GroceryRepository;

public class GoceryRepositoryimpl implements GroceryRepository {

	private String[] gro =new String[TOTAL_ITEMS]; 
	private int position;
	
	@Override
	public void save(String grocery) {
		System.out.println("invoking main save in GoceryRepositoryimpl");
		if(position < TOTAL_ITEMS) {
			this.gro[position] = grocery;
			System.out.println("stored"+grocery+ "is in position"+this.position);
			this.position++;
					}
		else {
			System.out.println("storage is full");
		}	
	}
}
