package spoo.app;

public class CoffeCold extends Coffe{
	public CoffeCold()
	{
		this("Black Coffee",10,"Bru",true);
		System.out.println("Invoking no-arg in CoffeCold");
	}
	public CoffeCold(String name,double price,String brand,boolean tasty)
	{
		super(name,price,brand,tasty);
		System.out.println("Invoking String,double and boolean in CoffeCold");
	}
}
