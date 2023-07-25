class HelmetKiller{
	public static void main(String[] args){
		System.out.println("Running main in HelmetKiller");
		
		Helmet helmet=new Helmet(1300,'L');
		Helmet.staticHelmet();
		helmet.instanceHelmet();
		
		System.out.println("##################################");
		
		Helmet helmet1=new Helmet(900,'M');
		Helmet.staticHelmet();
		helmet1.instanceHelmet();
		
	}
}