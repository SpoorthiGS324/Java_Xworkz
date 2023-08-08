package polymorphism.app;

public class GateKiller {

	public static void main(String[] args) {
		System.out.println("invoking main in GateKiller");
		Gate gate = new GateElectric();
		gate.open();
	}

}
