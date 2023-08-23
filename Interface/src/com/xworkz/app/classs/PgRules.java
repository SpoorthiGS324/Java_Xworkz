package com.xworkz.app.classs;

import com.xworkz.app.Pg;

public class PgRules implements Pg {

	@Override
	public double rent() {
		System.out.println("rent in Pg");
		return 5000.00;
	}

	@Override
	public int NightTimings() {
		System.out.println("nighttimings in Pg");
		return 10;
	}

	@Override
	public boolean BoysnotAllowed() {
		System.out.println("boysnotallowed in Pg");
		return true;
	}

}
