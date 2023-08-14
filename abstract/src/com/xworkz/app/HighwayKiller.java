package com.xworkz.app;

public class HighwayKiller {

	public static void main(String[] args) {
		System.out.println("invoking highway runner in main method");
		Highway highway=new HighwayBangalore();
		highway.connectivity();
		highway.interConnection();
		highway.economicGrowth();
		highway.publicService();
		highway.safety();
		highway.tourism();
		highway.trade();
		highway.transport();
		highway.travel();
		

	}
}
