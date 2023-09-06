package com.xworkz.Repository.app.impl;

import com.xworkz.Repository.app.CountryRepository;

public class CountryRepositoryImpl implements CountryRepository {


	private String[] countries =new String[TOTAL_ITEMS]; 
	private int position;
	 
	@Override
	public void store(String name) {
		
		System.out.println("invoking main save in JuiceRepositoryImpl");
		if(position < TOTAL_ITEMS) {
			this.countries[position] = name;
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
			String temp=this.countries[index];
			if(temp!=null && temp.equals(countries))
			{
				System.out.println("juice already exits");
				return true;
			}
		}
		
		return CountryRepository.super.IsExist(name);
		
	}
	}


