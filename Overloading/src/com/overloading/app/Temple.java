package com.overloading.app;

public class Temple {
	public void pooje() {
		System.out.println("no arg in pooje");
	}

	public void pooje(String templeName) {
		System.out.println("invoking main in String im pooje");
		System.out.println("Temple Name : " + templeName);
	}

	public void pooje(String templeName, String location) {
		System.out.println("invokinhg main in String , String in pooje");
		System.out.println("Temple Name : " + templeName);
		System.out.println("Temple Location : " + location);
	}

	public void pooje(double openTiming) {
		System.out.println("invoking main in double in pooje");
		System.out.println("Temple Open Timings : " + openTiming);
	}

	public void pooje(double openTiming, double closeTiming) {
		System.out.println("invoking main double,double in pooje");
		System.out.println("Temple Open Timings : " + openTiming);
		System.out.println("Temple close Timings : " + closeTiming);
	}

	public void pooje(String templeName, double entranceFee) {
		System.out.println("invokinhg main in String , double in pooje");
		System.out.println("Temple Name : " + templeName);
		System.out.println("Entrance Fee : " + entranceFee);
		
	}

}
