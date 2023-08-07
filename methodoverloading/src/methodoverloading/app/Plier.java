package methodoverloading.app;

public class Plier {
	public String brand;
	public char size;
	
	public void tool()
	{
		System.out.println("invoking main in tool no-arg");
		tool("Stanley");
		tool('M');
	}
	
	public void tool(String brand) {
		System.out.println("invoking main in tool String");
		System.out.println("Brand Name :"+brand);
	}
	
	public void tool(char size)
	{
		System.out.println("invoking main in tool char");
		System.out.println("Size :"+size);
	}
	
	public void tool(String brand,char size)
	{
		System.out.println("invoking main in tool String, Char..");
		tool(brand);
		tool(size);
	}
}
