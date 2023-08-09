package com.overloading.app;

public class Theater {
	public void show() {
		System.out.println("Calling Parent Classs method with NO-arg");
	}

	public void show(String movieName) {
		System.out.println("invoking main String in show");
		System.out.println("MOVIE NAME : " + movieName);
	}

	public void show(String hero, String heroin) {
		System.out.println("invoking main String,String in show");
		System.out.println("HERO NAME : " + hero);
		System.out.println("HEROIN NAME : " + heroin);
	}

	public void show(String movieName, String hero, String heroin) {
		System.out.println("invoking main String,string,String in show");
		System.out.println("MOVIE NAME : " + movieName);
		System.out.println("HERO NAME : " + hero);
		System.out.println("HEROIN NAME : " + heroin);
	}

	public void show(double budget) {
		System.out.println("invoking main double in show");
		System.out.println("BUDGET : " + budget);
	}

	public void show(String genere, double rating) {
		System.out.println("invoking main String,double  in show");
		System.out.println("GENERE : " + genere);
		System.out.println("RATING : " + rating);
	}

}
