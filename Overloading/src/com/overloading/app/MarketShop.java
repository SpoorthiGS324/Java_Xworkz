package com.overloading.app;

public class MarketShop extends Market {

	@Override
	public void purchase() {
		System.out.println(" no-arg ");
	}

	@Override
	public void purchase(String name) {
		System.out.println("NAME OF Veg : " + name);
	}

	@Override
	public void purchase(String name, double cost) {
		System.out.println("NAME OF Veg : " + name);
		System.out.println("COST : " + name);
	}
	
	@Override
	public void purchase(double kg) {
		System.out.println("KG : " + kg);
	}

	@Override
	public void purchase(int variety) {
		System.out.println("Varieties : " + variety);
	}

	@Override
	public void purchase(String name, int variety) {
		System.out.println("NAME OF Veg : " + name);
		System.out.println("variety : " + variety);
	}
}
