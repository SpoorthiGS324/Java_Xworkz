class Resume{
	
	static void format()
	{
		System.out.println("invoking format() in Resume");
	}
	
	static void format(String type)
	{
		System.out.println("invoking format(type) in Resume");
		System.out.println("Type :"+type);
	}
	
	static void format(String type, int pages)
	{
		System.out.println("invoking format(type,pages) in Resume");
		System.out.println("Type :"+type);
		System.out.println("Pages :"+pages);
	}
	
	static void clear()
	{
		System.out.println("invoking clear() in Resume");
	}
	
	static void delete()
	{
		System.out.println("invoking delete() in Resume");
	}
}
