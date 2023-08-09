package com.overloading.app;

public class TempleHanuman extends Temple{
	@Override
	public void pooje() {
		System.out.println("no arg in pooje");
	}

	@Override
	public void pooje(String templeName) {
		System.out.println("Temple Name : " + templeName);
	}
	
	@Override
	public void pooje(String templeName, String location) {
		System.out.println("Temple Name : " + templeName);
		System.out.println("Temple Location : " + location);
	}
	
	@Override
	public void pooje(double openTiming) {
		System.out.println("Temple Open Timings : " + openTiming);
	}

	@Override
	public void pooje(double openTiming, double closeTiming) {
		System.out.println("Temple Open Timings : " + openTiming);
		System.out.println("Temple close Timings : " + closeTiming);
	}

	@Override
	public void pooje(String templeName, double entranceFee) {
		System.out.println("Temple Name : " + templeName);
		System.out.println("Entrance Fee : " + entranceFee);
		
	}

}
