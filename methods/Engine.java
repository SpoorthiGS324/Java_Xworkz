class Engine{
	static int getCCByModel(String carname)
	{
		System.out.println("Car Name");
		if(carname!=null)
		{
			if(carname==swift)
		{
			System.out.println("The carname is :"+carname);
			return 1197;
		}
		if(carname==rapid)
		{
			System.out.println("The carname is :"+carname);
			return 999;
		}
		if(carname==BMW)
		{
			System.out.println("The carname is :"+carname);
			return 2998;
		}
		if(carname==benz)
		{
			System.out.println("The carname is :"+carname);
			return 1496;
		}
		if(carname==audi)
		{
			System.out.println("The carname is :"+carname);
			return 1395;
		}
		if(carname==bently)
		{
			System.out.println("The carname is :"+carname);
			return 5998;
		}
		else
		{
			System.err.println("The carname is  invalid");
			return carname;
		}
		
		}
		
	}
	

}