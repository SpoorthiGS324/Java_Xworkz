package spoo.app;

public class RopeAnother extends Rope{
	
	public RopeAnother()
	{
		this("Hard",345,"Skin",200);
		System.out.println("Invoking no-args in RopeAnother");	
	}
	
	
	public RopeAnother(String material,double price,String color,int length)
	{
		super(material,price,color,length);
		System.out.println("Invoking String,double,String,int in RopeAnother");
	}
}

