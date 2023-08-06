package spoo.app;

public class DiamondPure extends Diamond{
	public DiamondPure()
	{
		this("Ariketh","Shimoga",50000.30,20);
		System.out.println("Invoking no-arg in DiamondPure");
	}
	public DiamondPure(String shopeName,String address,double price,double weight)
	{
		super(shopeName,address,price,weight);
		System.out.println("Invoking String and double in DiamondPure");
	}
}
