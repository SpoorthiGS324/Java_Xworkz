package spoo.app;

public class GroundCricket extends Ground {
	public GroundCricket()
	{
		this("ChinnaSwamy","137m",11,"Rajajinagar");
		System.out.println("Invoking no-arg in GroundCricket");
	}
	
	
	public GroundCricket(String name,String dimension,int noOfPlayer,String location)
	{
		super(name,dimension,noOfPlayer,location);
		System.out.println("Invoking String,int in GroundCricket");
	}
}
