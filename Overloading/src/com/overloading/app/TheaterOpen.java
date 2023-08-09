package com.overloading.app;

public class TheaterOpen extends Theater{

	@Override
	public void show() {
		System.out.println("Calling Parent Classs method with NO-arg");
	}

	@Override
	public void show(String movieName) {
		System.out.println("MOVIE NAME : " + movieName);
	}

	@Override
	public void show(String hero, String heroin) {
		System.out.println("HERO NAME : " + hero);
		System.out.println("HEROIN NAME : " + heroin);
	}

	@Override
	public void show(String movieName, String hero, String heroin) {
		System.out.println("MOVIE NAME : " + movieName);
		System.out.println("HERO NAME : " + hero);
		System.out.println("HEROIN NAME : " + heroin);
	}

	@Override
	public void show(double budget) {
		System.out.println("BUDGET : " + budget);
	}

	@Override
	public void show(String genere, double rating) {
		System.out.println("GENERE : " + genere);
		System.out.println("RATING : " + rating);
	}
}
