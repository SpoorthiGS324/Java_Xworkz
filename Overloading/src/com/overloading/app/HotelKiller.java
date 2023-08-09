package com.overloading.app;

public class HotelKiller {

	public static void main(String[] args) {
		
		Hotel hotel = new Hotel();
		hotel.hotel();
		hotel.hotel("namura biryani");
		hotel.hotel("namura biryani",10);
		hotel.hotel("namura biryani",10,"kengri");
		hotel.hotel("namura biryani",10,"kengri",11);
		hotel.hotel("namura biryani",10,"kengri",11,1000.0f);
		
		System.out.println("-------------------------------------");
		
		Hotel hotel1 = new HotelBest();
		hotel1.hotel();
		hotel1.hotel("RoyalOrchid");
		hotel1.hotel("RoyalOrchid",12);
		hotel1.hotel("RoyalOrchid",12,"Shimoga");
		hotel1.hotel("RoyalOrchid",12,"Shimoga",7);
		hotel1.hotel("RoyalOrchid",12,"Shimoga",7,5000.0f);
		
		
		System.out.println("-------------------------------------");
		
		
		HotelBest hotel2 = new HotelBest();
		hotel2.hotel();
		hotel2.hotel("Barbique");
		hotel2.hotel("Barbique",15);
		hotel2.hotel("Barbique",15,"Bengaluru");
		hotel2.hotel("Barbique",15,"Bengaluru",5);
		hotel2.hotel("Barbique",15,"Bengaluru",5,2000.0f);
	}

}
