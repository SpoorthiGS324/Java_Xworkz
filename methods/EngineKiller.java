class EngineKiller{
	public static void main(String[] args)
	{
		System.out.println("Running main in EngineKiller");
		
			int ref1 = Engine.getCCByModel(1197);
			System.out.println("swift cc:"+ref1);
			
			int ref2 = Engine.getCCByModel(999);
			System.out.println("rapid cc:"+ref2);
			
			int ref3 = Engine.getCCByModel(2298);
			System.out.println("BMW cc:"+ref3);
			
			int ref4 = Engine.getCCByModel(1496);
			System.out.println("benz cc:"+ref4);
			
			int ref5 = Engine.getCCByModel(1395);
			System.out.println("audi cc:"+ref5);
			
			int ref6 = Engine.getCCByModel(5998);
			System.out.println("bently cc:"+ref6);
		
	}
}