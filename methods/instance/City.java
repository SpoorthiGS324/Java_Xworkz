class City{
	String cityName;
	int noOfPeoples;
	int pincode;
	
	City()
	{
		System.out.println("invoking const in City");
		System.out.println("Invoking no-arguments from City");
		System.out.println("The city name is :"+this.cityName);
		System.out.println("The no of peopoles in city :"+this.noOfPeoples);
		System.out.println("The city pincode is :"+this.pincode);
		this.cityName="Bangalore"; 
		this.noOfPeoples=60000;
		this.pincode=530068;
		
	}
	City(String cityName, int noOfPeoples, int pincode ){ //local variable or parameter
		System.out.println("Invoking arguments from City");
		this.cityName=cityName; //assign variable to instance variable
		this.noOfPeoples=noOfPeoples;
		this.pincode=pincode;
	}
}





