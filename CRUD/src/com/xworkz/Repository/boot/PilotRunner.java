package com.xworkz.Repository.boot;

import com.xworkz.Repository.app.Pilot;
import com.xworkz.Repository.app.impl.PilotImpl;

public class PilotRunner {

	public static void main(String[] args) {

		 Pilot ref = new  PilotImpl();
		 ref.fly("wilbur");
		 ref.fly("orville");
		 ref.fly("chuck");
		 ref.fly("charles");
		 ref.fly("albert");
		 ref.fly("jimmy");
		 ref.fly("jean");
		 ref.fly("chesely");
		 ref.fly("louis");
		 ref.fly("noel");
		
	}

}
