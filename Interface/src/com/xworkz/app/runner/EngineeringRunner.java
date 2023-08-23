package com.xworkz.app.runner;

import com.xworkz.app.Engineering;
import com.xworkz.app.classs.EngineeringRules;

public class EngineeringRunner {

	public static void main(String[] args) {

		Engineering engineering = new EngineeringRules();
		engineering.attendence("Spoorthi");
		engineering.average(7.8);
		engineering.WearId();
	}

}
