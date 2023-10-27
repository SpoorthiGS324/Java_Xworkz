package com.xworkz.Repository.app.service;

import com.xworkz.Repository.app.CountryRepository;
import com.xworkz.Repository.app.LocationRepository;

public class CountryServiceImpl implements CountryService {
	private CountryRepository countryRepository;

	public CountryServiceImpl(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

	@Override
	public boolean validateAndSave(String name) {

		System.out.println("invoking validate and save " + this.getClass().getSimpleName());
		if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20) {
			System.out.println("juice data is valid");
			if (!this.countryRepository.IsExist(name)) {
				this.countryRepository.store(name);
				return true;
			}

			else {
				System.err.println("country name" + name + "already exits add another one ");
			}
		} else {
			System.err.println("country name " + name + "is valid");
		}

		return false;
	}

}
