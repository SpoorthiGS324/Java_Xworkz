package com.overloading.app;

public class MallOrion extends Mall{
	@Override
	public void shop() {
		System.out.println("no arg in brand");
	}

	@Override
	public void shop(String name) {
		System.out.println("Mall NAME : " + name);
	}

	@Override
	public void shop(String name, int floornumber) {
		System.out.println("BRAND NAME : " + name);
		System.out.println("Floor Number : " + floornumber);
	}

	@Override
	public void shop(boolean hasFoodCourt) {
		System.out.println("HAS FOOD COURT : " + hasFoodCourt);
	}

	@Override
	public void shop(String name, boolean hasTheater) {
		System.out.println("Mall NAME : " + name);
		System.out.println("HAS Theater : " + hasTheater);
	}

	@Override
	public void shop(int totalNoOfFloor) {
		System.out.println("Total number of Floor  : " + totalNoOfFloor);
	}

}
