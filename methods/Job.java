class Job{
	
	static void apply()
	{      
		System.out.println("invoking apply() in job");
		
	}

	static void apply(String personName, int exp)
	{
		System.out.println("invoking apply(String, int) in job");
		System.out.println("PersonName:"+personName);
		System.out.println("Exp:"+exp);
	}
	
	static void apply(String name, int exp, String refName)
	{
		System.out.println("invoking apply(String, int, String) in job");
		System.out.println("Name:"+name);
		System.out.println("Exp:"+exp);
		System.out.println("RefName:"+refName);
	}

	static void apply( int exp )
	{
		System.out.println("invoking apply(int) in job");
		System.out.println("Exp:"+exp);
	}	
	
	static void rejectoffer()
	{
		System.out.println("invoking rejectoffer() in job");
	}
}



















