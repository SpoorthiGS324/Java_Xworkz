class ResumeKiller{
	
	public static void main(String[] args)
	{
		Resume.format();
		System.out.println("\n");
		
		Resume.format("Mini");
		System.out.println("\n");
		
		Resume.format("Targeted",4);
		System.out.println("\n");
		
		Resume.clear();
		System.out.println("\n");
		
		Resume.delete();
	}
	
	
	
}