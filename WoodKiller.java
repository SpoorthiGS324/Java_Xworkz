class WoodKiller{
	public static void main(String[] args)
	{
		
		System.out.println("Invoking in WoodKiller");
		
		Wood wood = new Wood("Maple");
		
		System.out.println("=========================");
		
		Wood wood1 = new Wood("Ash","Teak","Brown");
		
		System.out.println("=========================");
		
		Wood wood2 = new Wood("Ash","Teak","Brown",50000.0d,300.0f);
		
	}
}