class JobKiller{
	public static void main(String[] values)
	{
		System.out.println("invoking main in JobKiller");
		
		Job.apply();
		System.out.println("\n");
		
		Job.apply("Spoorthi",5 );
		System.out.println("\n");
		
		Job.apply("Deepak",7,"Adarsh");
		System.out.println("\n");
		
		Job.apply(4);
		System.out.println("\n");
		
		Job.rejectoffer();
	}
}