package app;

public class Bus {
	String type;
	private Paseenger paseenger;
	
	public Bus(String type) {
		this.type=type;
		System.out.println("bus name is:"+type);
		
	}
	
	public void setPaseenger(Paseenger paseenger) {
		this.paseenger=paseenger;
	}
	
	public void drive() {
		System.out.println("inkoing main drive in bus");
		System.out.println("total Paseenger are :"+this.paseenger.totalPaseenger());
	}

}
