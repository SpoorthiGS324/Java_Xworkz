class CityKiller{
	public static void main(String[] args){
		System.out.println("Invoking main in CityKiller");
		
		City city=new City();
		System.out.println("The city name in main method:"+city.cityName);
		System.out.println("The no of peoples in main method:"+city.noOfPeoples);
		System.out.println("The city pinncode in main method"+city.pincode);
		
		System.out.println("***********");
		
		City city1=new City("Shimoga",40000,577301);
		System.out.println("The city name in main method:"+city1.cityName);
		System.out.println("The no of peoples in main method:"+city1.noOfPeoples);
		System.out.println("The city pinncode in main method"+city1.pincode);
		
	}
}