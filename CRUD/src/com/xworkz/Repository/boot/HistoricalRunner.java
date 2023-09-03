package com.xworkz.Repository.boot;

import com.xworkz.Repository.app.HistoricalRepo;
import com.xworkz.Repository.app.impl.HistoricalImpl;

public class HistoricalRunner {

	public static void main(String[] args) {

		HistoricalRepo ref = new  HistoricalImpl();
		ref.view("darmastala");
		ref.view("tirupathi");
		ref.view("gajnur");
		ref.view("brp");
		ref.view("beach");
		ref.view("mysorepalace");
		ref.view("amruthapura");
		ref.view("chikmangular");
		ref.view("hampi");
		ref.view("agra");
	}

}
