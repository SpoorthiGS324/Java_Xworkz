package com.xworkz.inteface2.runner;

import com.xworkz.inteface2.AppartmentRule;
import com.xworkz.inteface2.BuildAppartment;
import com.xworkz.inteface2.CommonAppartmet;
import com.xworkz.inteface2.PurchaseAppartment;
import com.xworkz.inteface2.classs.PestiageAppartmentule;

public class AppartmentRunner {

	public static void main(String[] args) {

		System.out.println("inkoing main in AppartmentRunner");

		
		CommonAppartmet ref = new PestiageAppartmentule();
		
		BuildAppartment ref1 = new PestiageAppartmentule();
		
		PurchaseAppartment ref2 = new PestiageAppartmentule();
		
		AppartmentRule ref3 = new PestiageAppartmentule();
		
		ref.construct();
		ref1.construct();
		ref2.construct();
		ref3.construct();
		
	}

}
