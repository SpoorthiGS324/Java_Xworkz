class Mall{
	String name;
	String location;
	String mallType;
	int products;
	String owner;
	float price;
	int noOfWorkers;
	
	Mall()
	{
		super();
		System.out.println("Invoking no-arg constructor of Mall");
	}
	
	
	Mall(String name,String location)
	{
		this();
		this.name=name;
		this.location=location;
		System.out.println("Invoking string,string constructor of Mall");	
	}
	
	
	Mall(String name,String location,String mallType)
	{
		this(name,location);
		this.mallType=mallType;
		System.out.println("Invoking string,string,string constructor of Mall");
	}
	
	
	Mall(String name,String location,String mallType,int products)
	{
		this(name,location,mallType);
		this.products=products;
		System.out.println("Invoking string,string,String,int constructor of Mall");
	}
	
	
	Mall(String name,String location,String mallType,int products,String owner)
	{
		this(name,location,mallType,products);
		this.owner=owner;
		System.out.println("Invoking string,String,string,int,string constructor of Mall");
	}
	
	
	Mall(String name,String location,String mallType,int products,String owner,float price)
	{
		this(name,location,mallType,products,owner);
		this.price=price;
		System.out.println("Invoking string,String,string,int,string,float constructor of Mall");
	}
	
	
	Mall(String name,String location,String mallType,int products,String owner,float price,int noOfWorkers)
	{
		this(name,location,mallType,products,owner,price);
		this.noOfWorkers=noOfWorkers;
		System.out.println("Invoking string,String,int,string,float,int constructor of Mall");
	}
}