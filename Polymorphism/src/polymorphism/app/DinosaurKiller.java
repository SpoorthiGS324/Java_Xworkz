package polymorphism.app;

public class DinosaurKiller {

	public static void main(String[] args) {
		System.out.println("invoking no arg in DinosaurKiller");
		Dinosaur dinosaur= new DinosaurFerocoius();
		dinosaur.run();

	}

}
