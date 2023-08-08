package polymorphism.app;

public class CoalKiller {

	public static void main(String[] args) {
		System.out.println("invoking main in CoalKiller");
		Coal coal = new CoalBest();
		coal.brun();
	}

}
