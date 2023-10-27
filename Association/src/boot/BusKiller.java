package boot;

import app.Bus;
import app.Paseenger;

public class BusKiller {

	public static void main(String[] args) {

		String type = "BMTC";
		
		Paseenger paseenger = new Paseenger();
		
		Bus bus  = new Bus(type);
		
		bus.setPaseenger(paseenger);
		bus.drive();
		
	}

}

