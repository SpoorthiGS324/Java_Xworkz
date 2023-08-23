package com.xworkz.app.runner;

import com.xworkz.app.Metro;
import com.xworkz.app.classs.MetroRules;

public class MetroRunner {

	public static void main(String[] args) {

		
		
		Metro metro = new MetroRules();
		metro.check("Spoo");
		metro.traintimimg(10);
		metro.price(120.00);
		
		
	}

}
