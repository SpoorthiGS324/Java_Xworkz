class  Candle{
	static String company;
	static String fuel;
	int price;
	String type;
	
	Candle(int price,String type){
		System.out.println("Invoking int , String constructor in Candle");
		this.price=price;
		this.type=type;
	}
	
	static{
		company="PAMCO";
		fuel="Wax";	
	}
	
	static void staticCandle(){
		System.out.println("static variables in Candle");
		System.out.println("company is:"+company);
		System.out.println("fuel is:"+fuel);

	}
	void instanceCandle(){
		System.out.println("instance variables in Candle");
	    System.out.println("Price is:"+price);
		System.out.println("type is:"+type);


	}
}