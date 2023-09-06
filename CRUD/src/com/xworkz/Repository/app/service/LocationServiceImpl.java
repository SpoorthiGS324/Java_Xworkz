package com.xworkz.Repository.app.service;

import com.xworkz.Repository.app.JuiceRepository;
import com.xworkz.Repository.app.LocationRepository;

public class LocationServiceImpl implements LocationService {


	private LocationRepository locationRepository;
	
	public LocationServiceImpl(LocationRepository locationRepository) {
		this.locationRepository = locationRepository;
	}
	
	@Override
	public boolean validateAndSave(String name) {
		
		System.out.println("invoking validate and save "+this.getClass().getSimpleName());
		if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20)
		{
			System.out.println("juice data is valid");
			if(!this.locationRepository.IsExist(name))
			{
			this.locationRepository.store(name);
			return true;
		}
		
		else {
			System.err.println("location name" +name+ "already exits add another one ");
		}
		}
		else
		{
			System.err.println("location name "+name+ "is valid");
		}
		
		return false;
	}

}
