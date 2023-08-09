package com.overloading.app;

public class StreetKiller {

	public static void main(String[] args) {
		System.out.println("invoking main in StreetKiller");
		
		
		Street street = new Street();
		street.light();
		street.light("Shivanagar");
		street.light("Shivanagar",3000);
		street.light("Shivanagar",3000,"Karnataka");
		street.light("Shivanagar",3000,"Karnataka","Shivajinagar");
		street.light("Shivanagar",3000,"Karnataka","Shivajinagar",2000);
		
		System.out.println("============================");

		
		Street street2 = new StreetLane();
		street2.light();
		street2.light("Rajajinagar");
		street2.light("Rajajinagar",4000);
		street2.light("Rajajinagar",4000,"Karnataka");
		street2.light("Rajajinagar",4000,"Karnataka","Bashamsham circle");
		street2.light("Rajajinagar",4000,"Karnataka","Bashamsham circle",3000);
		
		System.out.println("==================================");

		StreetLane street3 = new StreetLane();
		street3.light();
		street3.light("Vijaynagar");
		street3.light("Vijaynagar",9000);
		street3.light("Vijaynagar",9000,"Karnataka");
		street3.light("Vijaynagar",9000,"Karnataka","Maruthimandir");
		street3.light("Vijaynagar",9000,"Karnataka","Maruthimandir ",9000);
		
	}
}
