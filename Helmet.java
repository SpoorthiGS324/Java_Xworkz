class Helmet{
	static String brand;
	static String shape;
	double price;
	char size;
	
	Helmet(double price,char size){
		System.out.println("Invoking double,char constructor in Helmet");
		this.price=price;
		this.size=size;
	}
	
	static{
		brand="STUDDS";
		shape="dome";	
	}
	
	static void staticHelmet(){
		System.out.println("static variables in Helmet");
		System.out.println("Brand is:"+brand);
		System.out.println("Shape is:"+shape);

	}
	void instanceHelmet(){
		System.out.println("instance variables in Helmet");
	    System.out.println("Price is:"+price);
		System.out.println("Size is:"+size);


	}
}