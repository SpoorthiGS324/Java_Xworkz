package polymorphism.app;

public class BangleKiller {

	public static void main(String[] args) {
		System.out.println("invoking main in  BangleKiller");
		Bangle bangle =  new BangleGold();
		bangle.roll();
	}

}
