package com.xworkz.farmer.app.boot;

import com.xworkz.farmer.app.Farmer;
import com.xworkz.farmer.app.Land;

public class FarmerKiller {

	public static void main(String[] args) {

		
		String name ="Spoorthi";
		
		Farmer farmer = new Farmer(name);

		Land land = new Land();
		land.cropGrowing();
		
	}

}
