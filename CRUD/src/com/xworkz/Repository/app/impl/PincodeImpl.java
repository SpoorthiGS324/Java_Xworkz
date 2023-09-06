package com.xworkz.Repository.app.impl;

import com.xworkz.Repository.app.Pincode;

public class PincodeImpl implements Pincode {

	private int[] pincodes =new int[TOTAL_ITEMS]; 
	private int position;
	
	@Override
	public void store(int number) {
		System.out.println("invoking main save in PincodeImpl");
		if(position < TOTAL_ITEMS) {
			this.pincodes[position] = number;
			System.out.println("stored"+number+ "is in position"+this.position);
			this.position++;
					}
		else {
			System.err.println("storage is full");
	}

	}
	
	@Override
	public boolean IsExist(int number) {
		for(int index=0;index<=this.position;index++)
		{
			int temp=pincodes[index];
			if(temp!=0 && temp==number)
			{
				System.out.println("juice already exits");
				return true;
			}
		}
		
		return Pincode.super.IsExist(number);
		
	}
		
	}


