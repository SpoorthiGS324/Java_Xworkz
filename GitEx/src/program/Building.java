package program;

public class Building {
	public Floor[] floors;
	public Lift[] lifts;

	public Building(Floor[] floors, Lift[] lifts) {
		this.floors = floors;
		this.lifts = lifts;
	}

	public void printInfo() {
		System.out.println("=========================");
		System.out.println("Invoking printInfo in Building");
		System.out.println("Floors are:");
		for (int i = 0; i < this.floors.length; i++) {
			Floor ref = floors[i];
			ref.printInfo();
		}
		System.out.println("Lifts are:");
		for (int i = 0; i < this.lifts.length; i++) {
			Lift ref = lifts[i];
			ref.printInfo();
		}

	}

}
