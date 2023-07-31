package program;

public class HomeTown {

	public String name;
	public int pinCode;
	public Area[] area;

	public HomeTown(String name, int pinCode, Area[] area) {
		this.name = name;
		this.pinCode = pinCode;
		this.area = area;
	}

	public void printInfo() {
		System.out.println("====================");
		System.out.println("Invoking printInfo in Building");
		System.out.println("Building Name is:" + name);
		System.out.println("Pincode:" + pinCode);
		System.out.println("Areas are:");
		for (int i = 0; i < this.area.length; i++) {
			Area ref = area[i];
			ref.printInfo();

		}

	}
}
