package com.overloading.app;

public class Backery {

	public void sell() {
		System.out.println("no arg in sell");
	}

	public void sell(String item) {
		System.out.println("involing main String in sell");
		System.out.println("Item : " + item);
	}

	public void sell(double cost) {
		System.out.println("invoking main double in sell");
		System.out.println("Cost : " + cost);
	}

	public void sell(int noOfItem) {
		System.out.println("invoking main int in sell");
		System.out.println("No Of Item : " + noOfItem);
	}

	public void sell(String item, double cost) {
		System.out.println("invoking main String,item in sell");
		System.out.println("Item : " + item);
		System.out.println("Cost : " + cost);
	}

	public void sell(String item, int noOfItem, double cost) {
		System.out.println("invoking main String,item,double in sell");
		System.out.println("Item : " + item);
		System.out.println("No OF Items : " + noOfItem);
		System.out.println("Cost : " + cost);
	}
}
