package com.overloading.app;

public class City {
	public void travel() {
		System.out.println("no arg in travel");
	}

	public void travel(String name) {
		System.out.println("city name in super class: " + name);
	}

	public void travel(String name, boolean population) {
		System.out.println("city name in super class: " + name);
		System.out.println("city population in super class: " + population);
	}

	public void travel(String name, boolean population, String district) {
		System.out.println("city name in super class: " + name);
		System.out.println("city population in super class: " + population);
		System.out.println("city disctrict in super class: " + district);
	}

	public void travel(String name, boolean population, String district, String state) {
		System.out.println("city name in super class: " + name);
		System.out.println("city population in super class: " + population);
		System.out.println("city disctrict in super class: " + district);
		System.out.println("city state in super class: " + state);
	}

	public void travel(String name, boolean population, String district, String state, boolean houses) {
		System.out.println("city name in super class: " + name);
		System.out.println("city population in super class: " + population);
		System.out.println("city disctrict in super class: " + district);
		System.out.println("city state in super class: " + state);
		System.out.println("city has houses in super class: " + houses);
	}

}
