package com.xworkz.app.runner;

import com.xworkz.app.Pg;
import com.xworkz.app.classs.PgRules;

public class PgRunner {

	public static void main(String[] args) {

		Pg pg = new PgRules();
		pg.BoysnotAllowed();
		pg.NightTimings();
		pg.rent();
	

		}

}
