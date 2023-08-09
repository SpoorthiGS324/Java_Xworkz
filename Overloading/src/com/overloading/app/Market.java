package com.overloading.app;

public class Market {

	public void purchase() {
		System.out.println(" no-arg in purchase ");
	}

	public void purchase(String name) {
		System.out.println("invoking main String in purchase ");
		System.out.println("NAME OF Veg : " + name);
	}

	public void purchase(String name, double cost) {
		System.out.println("invoking main String,double in purchase ");
		System.out.println("NAME OF Veg : " + name);
		System.out.println("COST : " + name);
	}

	public void purchase(double kg) {
		System.out.println("invoking main double in purchase ");
		System.out.println("KG : " + kg);
	}

	public void purchase(int variety) {
		System.out.println("invoking main int in purchase ");
		System.out.println("Varieties : " + variety);
	}

	public void purchase(String name, int variety) {
		System.out.println("invoking main String,int  in purchase ");
		System.out.println("NAME OF Veg : " + name);
		System.out.println("variety : " + variety);
	}
}
