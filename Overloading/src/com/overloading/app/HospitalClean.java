package com.overloading.app;

public class HospitalClean extends Hospital{
	
	@Override
	public void checkup() {
		System.out.println("no-arg in ckeckup");
	}

	@Override
	public void checkup(String nameOfHospital) {
		System.out.println("Name Of Hospital : " + nameOfHospital);
	}

	@Override
	public void checkup(double costOfRegistration) {
		System.out.println("Cost of Registration : " + costOfRegistration);
	}

	@Override
	public void checkup(int noOfPatients) {
		System.out.println("No Of Patients : " + noOfPatients);
	}

	@Override
	public void checkup(String nameOfPatient, String disease) {
		System.out.println("Disease : " + disease);
		System.out.println("Name of Patient : " + nameOfPatient);
	}

	@Override
	public void checkup(String nameOfHospital, String nameOfPatient, double cost) {
		System.out.println("Hospital : " + nameOfHospital);
		System.out.println("Name of  patient : " + nameOfPatient);
		System.out.println("Cost : " + cost);
	}

}
