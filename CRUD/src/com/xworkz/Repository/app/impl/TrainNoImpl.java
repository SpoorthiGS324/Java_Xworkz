package com.xworkz.Repository.app.impl;

import com.xworkz.Repository.app.TrainNo;

public class TrainNoImpl implements TrainNo {

	
	private String[] trains =new String[TOTAL_ITEMS]; 
	private int position;
	
	@Override
	public void store(String name) {

		System.out.println("invoking main save in JuiceRepositoryImpl");
		if(position < TOTAL_ITEMS) {
			this.trains[position] = name;
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
			String temp=this.trains[index];
			if(temp!=null && temp.equals(name))
			{
				System.out.println("juice already exits");
				return true;
			}
		}
		
		return TrainNo.super.IsExist(name);
		
	}
		
	}


