package com.overloading.app;

public class Mall {
	public void shop() {
		System.out.println("no arg in brand");
	}

	public void shop(String name) {
		System.out.println("invoking main String in brand");
		System.out.println("Mall NAME : " + name);
	}

	public void shop(String name, int floornumber) {
		System.out.println("invoking main String, int in brand");
		System.out.println("BRAND NAME : " + name);
		System.out.println("Floor Number : " + floornumber);
	}

	public void shop(boolean hasFoodCourt) {
		System.out.println("invoking main boolean in brand");
		System.out.println("HAS FOOD COURT : " + hasFoodCourt);
	}

	public void shop(String name, boolean hasTheater) {
		System.out.println("invoking main String,boolean in brand");
		System.out.println("Mall NAME : " + name);
		System.out.println("HAS Theater : " + hasTheater);
	}

	public void shop(int totalNoOfFloor) {
		System.out.println("invoking main int in brand");
		System.out.println("Total number of Floor  : " + totalNoOfFloor);
	}

}
