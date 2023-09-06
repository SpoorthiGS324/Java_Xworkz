package com.xworkz.Repository.app.service;

import com.xworkz.Repository.app.LocationRepository;
import com.xworkz.Repository.app.TrainNo;

public class TrainNoServiceImpl implements TrainNoService {

	
	private TrainNo trainNo ;
	
	public TrainNoServiceImpl(TrainNo trainNo) {
		this.trainNo = trainNo;
	}
	
	@Override
	public boolean validateAndSave(String name) {

		System.out.println("invoking validate and save "+this.getClass().getSimpleName());
		if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20)
		{
			System.out.println("juice data is valid");
			if(!this.trainNo.IsExist(name))
			{
			this.trainNo.store(name);
			return true;
		}
		
		else {
			System.err.println("train no is" +name+ "already exits add another one ");
		}
		}
		else
		{
			System.err.println("train no is "+name+ "is valid");
		}
	
		return false;
	}

}
