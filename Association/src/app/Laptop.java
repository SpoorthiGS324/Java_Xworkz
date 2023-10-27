package app;

public class Laptop {
	String type;
	private Charger charger;
	
	public Laptop(String type) {
		this.type=type;
		System.out.println("Laptop name is:"+type);
		
	}
	
	public void setCharger(Charger charger) {
		this.Charger=charger;
		
	}
	

}
