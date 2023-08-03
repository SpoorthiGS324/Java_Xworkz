package spoorthi.app;

public class ZooUtil extends Zoo{
	public static void run(Zoo zoo)

	{
		if (zoo instanceof NationalZoo) {
			System.out.println("Invoking NationalZoo");
			
			NationalZoo nationalZoo=(NationalZoo)zoo;
			System.out.println(nationalZoo.name);	
			System.out.println(nationalZoo.tickePrice);
			nationalZoo.visit();
			nationalZoo.playWithAnimals();
			System.out.println("**********");

		}
		if (zoo instanceof StateZoo) {
			System.out.println("Invoking StateZoo");
			
			StateZoo stateZoo=(StateZoo)zoo;
			System.out.println(stateZoo.name);	
			System.out.println(stateZoo.location);
			stateZoo.visit();
			stateZoo.watchAnimals();
			System.out.println("**********");

		}
	}

	{

	}

}
