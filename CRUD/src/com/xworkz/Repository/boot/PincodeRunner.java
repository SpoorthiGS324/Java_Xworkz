package com.xworkz.Repository.boot;

import com.xworkz.Repository.app.Pincode;
import com.xworkz.Repository.app.impl.PincodeImpl;
import com.xworkz.Repository.app.service.PincodeService;
import com.xworkz.Repository.app.service.PincodeServiceImpl;

public class PincodeRunner {

	public static void main(String[] args) {

		
		Pincode pincode = new PincodeImpl();
		
		PincodeService pincodeService = new PincodeServiceImpl(pincode);
		
		pincodeService.validateAndSave(577301);
		pincodeService.validateAndSave(577302);
	}

}
