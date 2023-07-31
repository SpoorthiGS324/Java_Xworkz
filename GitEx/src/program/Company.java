package program;

public class Company {
	public String name;
	public String ceo;
	public String originCountry;
	
	public Company(String name, String ceo, String originCountry)
	{
		this.name=name;
		this.ceo=ceo;
		this.originCountry=originCountry;
	}
	
	public void printInfo()
	{
		

		System.out.println("Running printInfo in Company");
		System.out.println("Name is:"+this.name);
		System.out.println("CEO:"+this.ceo);
		System.out.println("Origin Country:"+this.originCountry);
		System.out.println("\n");

	}



}
