package methodoverloading.app;

public class Hotel {
	public String name;
	public double type;
	
	public void fivestar()
	{
		System.out.println("invoking main in fivestar  no-arg");
		fivestar("Nammura biryani");
		fivestar(true);
	}
	
	public void fivestar(String name) {
		System.out.println("invoking main in fivestar  String");
		System.out.println("Hotel Name :"+name);
	}
	
	public void fivestar(boolean type)
	{
		System.out.println("invoking main in fivestar boolean...");
		System.out.println("Pure Veg :"+type);
	}
	
	public void fivestar(String name,boolean type)
	{
		fivestar(name);
		fivestar(type);
	}
}
