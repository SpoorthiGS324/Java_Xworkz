package program;

public class Corporator {
	public Building[] buildings;
	public String name;

	public Corporator(String name, Building[] buildings) {
		this.name = name;
		this.buildings = buildings;
	}

	public void printInfo() {
		System.out.println("====================");
		System.out.println("Invoking printInfo in Corporator");
		System.out.println("Corporator Name is:" + name);
		for (int i = 0; i < this.buildings.length; i++) {
			Building ref = buildings[i];
			ref.printInfo();

		}
	}

}
