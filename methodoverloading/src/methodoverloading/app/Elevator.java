package methodoverloading.app;

public class Elevator {
	public String company;
	public int capacity;
	
	public void lift()
	{
		System.out.println("invoking main in lift no-arg");
		lift("Otis");
		lift(1500);
	}
	
	public void lift(String company)
	{
		System.out.println("invoking main in lift String");
		System.out.println("Company : "+company);
	}
	
	public void lift(int capacity)
	{
		System.out.println("invoking main in lift int");
		System.out.println("Capacity : "+capacity);
	}
	
	public void lift(String company,int capacity)
	{
		lift(company);
		lift(capacity);
	}
}
