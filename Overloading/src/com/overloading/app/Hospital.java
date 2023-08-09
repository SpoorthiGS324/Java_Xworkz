package com.overloading.app;

public class Hospital {

	public void checkup() {
		System.out.println("no-arg in ckeckup");
	}

	public void checkup(String nameOfHospital) {
		System.out.println("invoking main String in checkup");
		System.out.println("Name Of Hospital : " + nameOfHospital);
	}

	public void checkup(double costOfRegistration) {
		System.out.println("invoking main double in checkup");
		System.out.println("Cost of Registration : " + costOfRegistration);
	}

	public void checkup(int noOfPatients) {
		System.out.println("invoking main int  in checkup");
		System.out.println("No Of Patients : " + noOfPatients);
	}

	public void checkup(String nameOfPatient, String disease) {
		System.out.println("invoking main String,String in checkup");
		System.out.println("Disease : " + disease);
		System.out.println("Name of Patient : " + nameOfPatient);
	}

	public void checkup(String nameOfHospital, String nameOfPatient, double cost) {
		System.out.println("invoking main String,String,double in checkup");
		System.out.println("Hospital : " + nameOfHospital);
		System.out.println("Name of  patient : " + nameOfPatient);
		System.out.println("Cost : " + cost);
	}
}
