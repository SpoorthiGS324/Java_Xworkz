package com.xworkz.app.classs;

import com.xworkz.app.Military;

public class MilitaryRules implements Military {

	@Override
	public String HairCut(String name) {
		System.out.println("Haircut in Military");
		System.out.println("Name:"+name);
		return null;
	}

	@Override
	public boolean WearUnifiorm() {
		System.out.println("WearUnifiorm in Military");
		return false;
	}

	@Override
	public double height(double height) {
		System.out.println("height in Military");
		System.out.println("Height:"+ height);
		return 6.1;
	}

}
