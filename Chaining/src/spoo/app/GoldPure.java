package spoo.app;

public class GoldPure extends Gold{
	public  GoldPure()
	{
		this("KDM",50043.55,"Shimoga",14.55);
		System.out.println("Invoking no-arg in GoldPure");
	}
	public  GoldPure (String shopName,double price,String location,double weight)
	{
		super(shopName,price,location,weight);
		System.out.println("Invoking String and double is GoldPure");
	}
}
