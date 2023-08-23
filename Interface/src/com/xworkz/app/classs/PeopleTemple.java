package com.xworkz.app.classs;

import com.xworkz.app.Temple;

public class PeopleTemple implements Temple {

	@Override
	public boolean queue() {
		System.out.println("invoking main queue in Temple");
		return true;
	}

	@Override
	public double darshantiming(String Godname) {
		System.out.println("invoking main darshantiming in Temple");
		System.out.println("Godname:"+Godname);
		return 9.00;
	}

	@Override
	public boolean security() {
		System.out.println("invoking main security in Temple");
		return false;
	}

}
