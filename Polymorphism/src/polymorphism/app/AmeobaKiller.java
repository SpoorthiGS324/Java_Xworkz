package polymorphism.app;

public class AmeobaKiller {

	public static void main(String[] args) {
		System.out.println("invoking main in  AmeobaKiller");
		Ameoba ameoba = new AmeobaCell();
		ameoba.move();
	}

}
