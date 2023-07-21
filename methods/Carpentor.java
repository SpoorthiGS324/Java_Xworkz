class Carpentor{

	static void cut()
	{
		System.out.println("ruuning in main carpentor");
		
	}

	static void carpentor()
	{
		System.out.println("Running the carpentor");
		
	}
	
	static void carpentor(String name)
	{
		System.out.println("Name of carpentor:"+name);
		
	}
	
	static void carpentor(String name, int exp)
	{
		System.out.println("Name of carpentor :"+name);
		System.out.println("Exp of carpentor :"+exp);	
	}

	static void carpentor(String name, int exp, int salary)
	{
		System.out.println("Name of carpentor :"+name);
		System.out.println("Exp of carpentor :"+exp);	
		System.out.println("Salary of carpentor:"+salary);
	}
	
	static void payment(int salary)
	{
		System.out.println("Salary of carpentor:"+salary);
	
	}
	
	static void carpentorWork()
	{
		System.out.println("work done by carpentor");
	}
	
	static void plan()
	{
		System.out.println("plan done by carpentor");
	}
	
	static void contact(long phno)
	{
		System.out.println("contact number :"+phno);
		carpentorAddress();
	}
	
	static void carpentorAddress()
	{
		System.out.println("running main in carpentor addresss");
	}
	
}