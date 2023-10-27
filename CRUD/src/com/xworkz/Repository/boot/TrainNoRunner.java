package com.xworkz.Repository.boot;

import com.xworkz.Repository.app.TrainNo;
import com.xworkz.Repository.app.impl.TrainNoImpl;
import com.xworkz.Repository.app.service.TrainNoService;
import com.xworkz.Repository.app.service.TrainNoServiceImpl;

public class TrainNoRunner {

	public static void main(String[] args) {

		TrainNo trainNo = new TrainNoImpl();

		TrainNoService trainNoService = new TrainNoServiceImpl(trainNo);

		trainNoService.validateAndSave("12627");
		trainNoService.validateAndSave("12604");
	}

}
