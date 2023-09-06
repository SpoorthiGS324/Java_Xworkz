package com.xworkz.Repository.boot;

import com.xworkz.Repository.app.CountryRepository;
import com.xworkz.Repository.app.impl.CountryRepositoryImpl;
import com.xworkz.Repository.app.service.CountryService;
import com.xworkz.Repository.app.service.CountryServiceImpl;

public class CountryRunner {

	public static void main(String[] args) {
		CountryRepository countryRepository = new CountryRepositoryImpl();
		
		CountryService countryService = new CountryServiceImpl(countryRepository);
		
		countryService.validateAndSave("India");
		countryService.validateAndSave("US");

	}

}
