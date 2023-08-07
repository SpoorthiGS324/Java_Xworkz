package methodoverloading.app;

public class Stapler {
	public String brand;
	public double price;

	public void pin() {
		System.out.println("invoking main in  no-arg..");
		pin("scooboo");
		pin(228);
	}

	public void pin(String brand) {
		System.out.println("invoking main in String..");
		System.out.println("Brand :" + brand);
	}

	public void pin(double price) {
		System.out.println("invoking main in double..");
		System.out.println("Price :" + price);
	}

	public void pin(String brand, double price) {
		System.out.println("invoking main in String and double..");
		pin(brand);
		pin(price);
	}
}
