package com.xworkz.app.runner;

import com.xworkz.app.Military;
import com.xworkz.app.classs.MilitaryRules;

public class MilitaryRunner {

	public static void main(String[] args) {
		
		Military military = new MilitaryRules();
		military.HairCut("Deepak");
		military.height(6.1);
		military.WearUnifiorm();
	}

}
