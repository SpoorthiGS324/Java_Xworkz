package com.xworkz.Repository.app.impl;

import com.xworkz.Repository.app.JuiceRepository;

public class JuiceRepositoryImpl implements JuiceRepository {

	
	private String[] juices =new String[TOTAL_ITEMS]; 
	private int position;
	
	@Override
	public void store(String name) {
		System.out.println("invoking main save in JuiceRepositoryImpl");
		if(position < TOTAL_ITEMS) {
			this.juices[position] = name;
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
			String temp=this.juices[index];
			if(temp!=null && temp.equals(juices))
			{
				System.out.println("juice already exits");
				return true;
			}
		}
		
		return JuiceRepository.super.IsExist(name);
		
	}
	
}
