class ButterFlyKiller{
	public static void main(String[] args){
		System.out.println("Running main in ButterFlyKiller");
		
		ButterFly butterFly=new ButterFly("Monarch ButterFly",2);
		ButterFly.staticButterFly();
		butterFly.instanceButterFly();
		
		System.out.println("##################################");
		
		ButterFly butterFly1=new ButterFly("Apollo",1);
		ButterFly.staticButterFly();
		butterFly1.instanceButterFly();
		
	}
}