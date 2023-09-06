package com.xworkz.Repository.app.impl;

import com.xworkz.Repository.app.MobileNo;

public class MobileNoImpl implements MobileNo {

	
	private long[] mobiles =new long[TOTAL_ITEMS]; 
	private int position;
	
	
	@Override
	public void store(long number) {
		System.out.println("invoking main save in MobileNoImpl");
		if(position < TOTAL_ITEMS) {
			this.mobiles[position] = number;
			System.out.println("stored"+number+ "is in position"+this.position);
			this.position++;
					}
		else {
			System.err.println("storage is full");
	}

	}
	
	@Override
	public boolean IsExist(long number) {
		for(int index=0;index<=this.position;index++)
		{
			long temp=mobiles[index];
			if(temp!=0 && temp==number)
			{
				System.out.println("juice already exits");
				return true;
			}
		}
		
		return MobileNo.super.IsExist(number);
		
	}
		
	}


