class Bureau{
	static String brand;
	static String material;
	double cost;
	boolean withDrawer;
	
	Bureau(double cost,boolean withDrawer){
		System.out.println("Invoking double,boolean constructor in Bureau");
		this.cost=cost;
		this.withDrawer=withDrawer;
	}
	
	static{
		brand="Steelcase";
		material="Wood";	
	}
	
	static void staticBureau(){
		System.out.println("static variables in Bureau");
		System.out.println("Brand is:"+brand);
		System.out.println("material is:"+material);

	}
	void instanceBureau(){
		System.out.println("instance variables in Bureau");
	    System.out.println("Cost is:"+cost);
		System.out.println("With Drawer is:"+withDrawer);


	}
}