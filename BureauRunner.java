class BureauRunner{
	public static void main(String[] args){
		System.out.println("Running main in BureauRunner");
		
		Bureau bureau=new Bureau(54000,true);
		Bureau.staticBureau();
		bureau.instanceBureau();
		
		System.out.println("##################################");
		
		Bureau bureau1=new Bureau(25000,false);
		Bureau.staticBureau();
		bureau1.instanceBureau();
		
	}
}