package polymorphism.app;

public class DrumKiller {

	public static void main(String[] args) {
		System.out.println("invoking main in DrumKiller");
		Drum drum =new DrumCan();
		drum.roll();
	}

}
