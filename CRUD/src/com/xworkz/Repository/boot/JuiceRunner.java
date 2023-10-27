package com.xworkz.Repository.boot;

import com.xworkz.Repository.app.JuiceRepository;
import com.xworkz.Repository.app.impl.JuiceRepositoryImpl;
import com.xworkz.Repository.app.service.JuiceService;
import com.xworkz.Repository.app.service.JuiceServiceImpl;

public class JuiceRunner {

	public static void main(String[] args) {

		JuiceRepository juiceRepository = new JuiceRepositoryImpl();

		JuiceService juiceService = new JuiceServiceImpl(juiceRepository);

		juiceService.validateAndSave("apple juice");
		juiceService.validateAndSave("slice");

	}

}
