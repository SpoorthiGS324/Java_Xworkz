class Electrician{

	static void wiring()
	{
		System.out.println("running main in wiring);
		
	}

	static void shock()
	{
		System.out.println("Running the electrician");
		
	}
	
	static void  electrician(String name)
	{
		System.out.println("Name of  electrician:"+name);
		if(name!=null)
		{
			
		}
		
	}
	
	static void  electrician(String name, int exp)
	{
		System.out.println("Name of  electrician:"+name);
		System.out.println("Exp of  electrician :"+exp);	
	}

	static void  electrician(String name, int exp, int salary)
	{
		System.out.println("Name of electrician :"+name);
		System.out.println("Exp of  electrician :"+exp);	
		System.out.println("Salary of  electrician:"+salary);
	}
	
	static void payment(int salary)
	{
		System.out.println("Salary of  electrician:"+salary);
	
	}
	
	static void  electricianWork()
	{
		System.out.println("work done by  electrician");
	}
	
	static void plan()
	{
		System.out.println("plan done by  electrician");
	}
	
	static void maintain()
	{
		System.out.println("electrician maintain the work");
	}
	
	static void electricianAdress()
	{
		System.out.println("electrician address");
	}
	
}