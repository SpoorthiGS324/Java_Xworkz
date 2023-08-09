package com.overloading.app;

public class HospitalKiller {

	public static void main(String[] args) {
		System.out.println("invoking main in HospitalKiller");
		
		Hospital ref =new Hospital();
		ref.checkup();
		ref.checkup("Nirmala");
		ref.checkup(234.1d);
		ref.checkup(234);
		ref.checkup("nagu","headache");
		ref.checkup("Nirmala","nagu",234.0d);
		
		
		System.out.println("==============================");
		
		Hospital ref1 =new HospitalClean();
		ref1.checkup();
		ref1.checkup("Shoba");
		ref1.checkup(123.1d);
		ref1.checkup(23);
		ref1.checkup("maanya","leginjure");
		ref1.checkup("shoba","maanya",235.0d);
		
		System.out.println("==============================");
		
		HospitalClean ref2 =new HospitalClean();
		ref2.checkup();
		ref2.checkup("megha");
		ref2.checkup(134.1d);
		ref2.checkup(87);
		ref2.checkup("sanu","handinjure");
		ref2.checkup("megha","sana",335.0d);
		
	}

}
