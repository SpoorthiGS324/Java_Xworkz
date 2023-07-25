class  Brick{
	static String brand;
	static String sand;
	int price;
	String color;
	
	Brick(int price,String color){
		System.out.println("Invoking int, String constructor in Brick");
		this.price=price;
		this.color=color;
	}
	
	static{
		brand="bharat pvt ltd";
		sand="clay";	
	}
	
	static void staticBrick(){
		System.out.println("static variables in Brick");
		System.out.println("Brand is:"+brand);
		System.out.println("Sand is:"+sand);

	}
	void instanceBrick(){
		System.out.println("instance variables in Brick");
	    System.out.println("Price is:"+price);
		System.out.println("color is:"+color);


	}
}