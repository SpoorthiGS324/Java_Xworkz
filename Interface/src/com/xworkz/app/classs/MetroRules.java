package com.xworkz.app.classs;

import com.xworkz.app.Metro;

public class MetroRules implements Metro {

	@Override
	public boolean check(String name) {
		System.out.println("check in metro");
		System.out.println("Name:"+name);
		return false;
	}

	@Override
	public double price(double amount) {
		System.out.println("price in metro");
		System.out.println("Amount:"+amount);
		return 100.00;
	}

	@Override
	public void traintimimg(int time) {
		System.out.println(" traintimimg in metro");
		System.out.println("Time:"+time);

	}

}
