package com.xworkz.Repository.app.service;

import com.xworkz.Repository.app.MobileNo;
import com.xworkz.Repository.app.TrainNo;

public class MobileServiceImpl implements MobileService {

	
	private MobileNo mobileNo ;
	
	public  MobileServiceImpl(MobileNo mobileNo) {
		this.mobileNo = mobileNo ;
	}
	
	
	@Override
	public boolean validateAndSave(long number) {
		
		System.out.println("invoking validate and save "+this.getClass().getSimpleName());
		if(number!=0 &&  number>1000000000l && number<9999999999l)
		{
			System.out.println("juice data is valid");
			if(!this.mobileNo.IsExist(number))
			{
			this.mobileNo.store(number);
			return true;
		}
		
		else {
			System.err.println("train no is" +number+ "already exits add another one ");
		}
		}
		else
		{
			System.err.println("train no is "+number+ "is valid");
		}
	
		return false;
	}

}
