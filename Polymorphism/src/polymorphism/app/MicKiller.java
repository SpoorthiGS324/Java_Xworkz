package polymorphism.app;

public class MicKiller {

	public static void main(String[] args) {
		System.out.println("invoking main in MicKiller");
		
		Mic mic = new MicAttomate();
		mic.sound();
		
	}

}
