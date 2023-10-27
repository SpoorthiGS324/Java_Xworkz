package com.xworkz.Repository.app.impl;

import com.xworkz.Repository.app.LocationRepository;

public class LocationRepositoryImpl implements LocationRepository {

	private String[] locations =new String[TOTAL_ITEMS]; 
	private int position;
	
	@Override
	public void store(String name) {

		System.out.println("invoking main save in LocationRepositoryImpl");
		if(position < TOTAL_ITEMS) {
			this.locations[position] = name;
			System.out.println("stored"+name+ "is in position"+this.position);
			this.position++;
					}
		else {
			System.err.println("storage is full");
	}
}

	@Override
	public boolean IsExist(String name) {
		for(int index=0;index<=this.position;index++)
		{
			String temp=this.locations[index];
			if(temp!=null && temp.equals(name))
			{
				System.out.println("juice already exits");
				return true;
			}
		}
		
		return  LocationRepository.super.IsExist(name);
		
	}
}
