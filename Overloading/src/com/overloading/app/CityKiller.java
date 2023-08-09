package com.overloading.app;

public class CityKiller {

	public static void main(String[] args) {
		System.out.println("invoking main in CityKiller");
		
		
		City city = new City();
		city.travel();
		city.travel("Bengalore");
		city.travel("Bengalore",true);
		city.travel("Bengalore",true,"Bengalore");
		city.travel("Bengalore",true,"Bengalore","Karnataka");
		city.travel("Bengalore",true,"Bengalore","Karnataka",true);
		
		System.out.println("==============================");
		
		City city2 = new CityRoad();
		city2.travel();
		city2.travel("davanagere");
		city2.travel("davanagere",true);
		city2.travel("davanagere",false,"davanagere");
		city2.travel("davanagere",true,"davanagere","Karnataka");
		city2.travel("davanagere",false,"davanagere","Karnataka",false);
		
		System.out.println("==============================");
		
		CityRoad city3 = new CityRoad();
		city3.travel();
		city3.travel("Mysore");
		city3.travel("Mysore",false);
		city3.travel("Mysore",false,"Mysore");
		city3.travel("Mysore",true,"Mysore","Karnataka");
		city3.travel("Mysore",false,"Mysore","Karnataka",true);
		
		

	}

}

