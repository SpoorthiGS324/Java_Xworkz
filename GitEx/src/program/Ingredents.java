package program;

public class Ingredents {
	public String name;
	public float quantity;
	public int cost;

	public Ingredents(String name, float quantity, int cost) {
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
	}

	public void printInfo() {
		System.out.println("Running printInfo in Ingredents");
		System.out.println("Name is:" + this.name);
		System.out.println("Quantity :" + this.quantity);
		System.out.println("Cost:" + this.cost);
		System.out.println("\n");
	}



}
