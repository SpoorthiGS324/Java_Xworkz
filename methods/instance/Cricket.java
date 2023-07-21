class Cricket{
	String name;
	int noOfPlayer;
	String stadium;
	
	Cricket()
	{
		System.out.println("invoking const in Cricket");
		System.out.println("Invoking no-arguments from Cricket");
		System.out.println("The Cricketer name is :"+this.name);
		System.out.println("The no of player in cricket :"+this.noOfPlayer);
		System.out.println("The stadium is :"+this.stadium);
		this.name="Dhoni"; 
		this.noOfPlayer=11;
		this.stadium="Chinnaswamy";
		
	}
	Cricket(String name, int noOfPlayer, String stadium ){ //local variable or parameter
		System.out.println("Invoking arguments from Cricket");
		this.name=name; //assign variable to instance variable
		this.noOfPlayer=noOfPlayer;
		this.stadium=stadium;
	}
}
