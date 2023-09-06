package com.xworkz.Repository.boot;

import com.xworkz.Repository.app.MobileNo;
import com.xworkz.Repository.app.impl.MobileNoImpl;
import com.xworkz.Repository.app.service.MobileService;
import com.xworkz.Repository.app.service.MobileServiceImpl;

public class MobileNoRunner {

	public static void main(String[] args) {

		MobileNo mobileNo = new MobileNoImpl();
		
		MobileService mobileService = new MobileServiceImpl(mobileNo);
		
		mobileService.validateAndSave(9845058504l);
		mobileService.validateAndSave(7975153403l);
	}
	}


