package com.xworkz.Repository.boot;

import com.xworkz.Repository.app.LocationRepository;
import com.xworkz.Repository.app.impl.LocationRepositoryImpl;
import com.xworkz.Repository.app.service.LocationService;
import com.xworkz.Repository.app.service.LocationServiceImpl;

public class LocationRunner {

	public static void main(String[] args) {

		LocationRepository locationRepository = new LocationRepositoryImpl();
		
		LocationService locationService = new LocationServiceImpl(locationRepository);
		
		locationService.validateAndSave("bhadravathi");
		locationService.validateAndSave("bangalore");
	}

}
