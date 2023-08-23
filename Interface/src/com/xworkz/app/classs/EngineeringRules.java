package com.xworkz.app.classs;

import com.xworkz.app.Engineering;

public class EngineeringRules implements Engineering {

	@Override
	public boolean attendence(String name) {
		System.out.println("Attensdence in Engineering");
		System.out.println("Name:"+name);
		return true;
	}

	@Override
	public double average(double average) {
		System.out.println("average in Engineering");
		System.out.println("Average:"+average);
		return 7.8;
	}

	@Override
	public boolean WearId() {
		System.out.println("wearid in Engineering");
		return true;
	}

}
