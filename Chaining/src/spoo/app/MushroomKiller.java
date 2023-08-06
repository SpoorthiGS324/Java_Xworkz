package spoo.app;

public class MushroomKiller {

	public static void main(String[] args) {
		System.out.println("Invoking main in MushroomKiller");
		Mushroom mushroom = new Mushroom("White", 50, 250, false);
		System.out.println(mushroom.color);
		System.out.println(mushroom.price);
		System.out.println(mushroom.quantity);
		System.out.println(mushroom.edible);

		System.out.println("-----------------------");
		PoisonMushroom poisonmushroom = new PoisonMushroom();
		System.out.println(poisonmushroom.color);
		System.out.println(poisonmushroom.price);
		System.out.println(poisonmushroom.quantity);
		System.out.println(poisonmushroom.edible);

		System.out.println("-----------------------");
		PoisonMushroom poisonmushroom1 = new PoisonMushroom("White", 250, 210, false);
		System.out.println(poisonmushroom1.color);
		System.out.println(poisonmushroom1.price);
		System.out.println(poisonmushroom1.quantity);
		System.out.println(poisonmushroom1.edible);
	}
}


