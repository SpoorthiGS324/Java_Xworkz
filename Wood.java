class Wood{
	String type;
	String name;
	String color;
	double price;
	float weight;
	
	Wood(){
		super();
		System.out.println("Invoking no-arg constructor of Wood");
	}
	
	
	Wood(String type)
	{
		this();
		this.type=type;
		System.out.println("Invoking string constructor of Wood");	
	}
	
	
	Wood(String type,String name)
	{
		this(type);
		this.name=name;
		System.out.println("Invoking string,string constructor of Wood");
	}
	
	
	Wood(String type,String name,String color)
	{
		this(type,name);
		this.color=color;
		System.out.println("Invoking string,string,String constructor of Wood");
	}
	
	
	Wood(String type,String name,String color,double price)
	{
		this(type,name,color);
		this.price=price;
		System.out.println("Invoking string,String,string,double constructor of Wood");
	}
	
	
	Wood(String type,String name,String color,double price,float weight)
	{
		this(type,name,color,price);
		this.weight=weight;
		System.out.println("Invoking string,double,String,string,float constructor of Wood");
	}
	
	
}