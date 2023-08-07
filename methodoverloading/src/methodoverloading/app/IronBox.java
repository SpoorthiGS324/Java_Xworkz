package methodoverloading.app;

public class IronBox {
	public String brand;
	public double prize;

	public void iron() {
		System.out.println("invoking main iron in no-arg");
		iron("Philips");
		iron(1399);
	}

	public void iron(String brand) {
		System.out.println("invoking main iron in String");
		System.out.println("Brand :" +brand);
	}

	public void iron(double prize) {
		System.out.println("invoking main iron in double");
		System.out.println("Prize :" +prize);
	}

	public void iron(String brand, double prize) {
		System.out.println("invoking main iron in  String, double");
		iron(brand);
		iron(prize);
	}
}
