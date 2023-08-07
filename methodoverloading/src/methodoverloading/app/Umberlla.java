package methodoverloading.app;

public class Umberlla {
	public String color;
	public double price;
	
	public void rain()
	{
		System.out.println("invoking main in no-arg");
		rain("Green");
		rain(299.9);
	}
	
	public void rain(String color)
	{
		System.out.println("invoking main in String");
		System.out.println("Color :"+color);
	}
	
	public void rain(double price)
	{
		System.out.println("invoking main in double");
		System.out.println("Price :"+price);
	}
	
	public void rain(String color,double price)
	{
		System.out.println("invoking main in String and double");
		rain(color);
		rain(price);
	}
}
