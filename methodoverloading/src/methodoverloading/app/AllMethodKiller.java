package methodoverloading.app;

public class AllMethodKiller {

	public static void main(String[] args) {
		
		System.out.println("Running main in Elevator");
		
		Elevator run=new Elevator();
		run.lift();
		System.out.println("\n");
		run.lift("Schilnder",762);
		
		
		System.out.println("----------------------------------");
		
		System.out.println("Running main in Gadget");
		Gadget product=new Gadget();
		product.item();
		System.out.println("\n");
		product.item("Fridge",15000);
		
		System.out.println("----------------------------------");
		
		
		System.out.println("Running main in Hotel");
		Hotel star=new Hotel();
		star.fivestar();
		System.out.println("\n");
		star.fivestar("Cliff",true);
		
		System.out.println("----------------------------------");
				
				
				
		System.out.println("Running main in IronBox");
		IronBox box=new IronBox();
		box.iron();
		System.out.println("\n");
		box.iron("Bajaj",2345);
		
		
		System.out.println("----------------------------------");
		
		
		System.out.println("Running main in Mouse");
		Mouse key=new Mouse();
		key.point();
		System.out.println("\n");
		key.point("Lenovo",1250);
		
		System.out.println("----------------------------------");
		
		
		
		System.out.println("Running main in plier");
		Plier kit=new Plier();
		kit.tool();
		System.out.println("\n");
		kit.tool("Klein",'M');

		System.out.println("----------------------------------");
		
		
		System.out.println("Running mai in Stapler");
		Stapler store=new Stapler();
		store.pin();
		System.out.println("\n");
		store.pin("Kangaro",543);
		
		
		System.out.println("----------------------------------");
		
		
		System.out.println("Running main in Umberlla");
		Umberlla drop=new Umberlla();
		drop.rain();
		System.out.println("\n");
		drop.rain("Pink",450);
	
	}

}


