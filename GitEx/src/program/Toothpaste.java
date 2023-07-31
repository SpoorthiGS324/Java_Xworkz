package program;

public class Toothpaste {
	public String name;
	public String brand;
	public Company company;
	public Ingredents[] ingredents;

	public Toothpaste(String name, String brand, Company company, Ingredents[] ingredents) {
		this.name = name;
		this.brand = brand;
		this.company = company;
		this.ingredents = ingredents;
	}

	public void printInfo() {
		System.out.println("Invoking printInfo in Toothpaste");

		System.out.println("Toothpaste Name is:" + this.name);
		System.out.println("Brand is:" + this.brand);
		System.out.println("\n");

		company.printInfo();
		for (int i = 0; i < this.ingredents.length; i++) {
			System.out.println("Ingredents are:");
			Ingredents ref = ingredents[i];
			ref.printInfo();

		}
	}

}
