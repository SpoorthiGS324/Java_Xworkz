package com.xworkz.Repository.app.service;

import com.xworkz.Repository.app.MobileNo;
import com.xworkz.Repository.app.Pincode;

public class PincodeServiceImpl implements PincodeService {

	private  Pincode pincode ;
	
	public  PincodeServiceImpl( Pincode pincode) {
		this.pincode = pincode ;
	}
	@Override
	public boolean validateAndSave(int number) {

		
		System.out.println("invoking validate and save "+this.getClass().getSimpleName());
		if(number!=0 &&  number>100000 && number<999999)
		{
			System.out.println("juice data is valid");
			if(!this.pincode.IsExist(number))
			{
			this.pincode.store(number);
			return true;
		}
		
		else {
			System.err.println("pincode is" +number+ "already exits add another one ");
		}
		}
		else
		{
			System.err.println("pincode is "+number+ "is valid");
		}
		
		return false;
	}

}
