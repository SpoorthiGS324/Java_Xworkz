class CricketKiller{
	public static void main(String[] args){
		System.out.println("Invoking main in CricketKiller");
		
		Cricket cricket=new Cricket();
		System.out.println("The Cricketer name in main method:"+cricket.name);
		System.out.println("The no of player  in main method:"+cricket.noOfPlayer);
		System.out.println("The stadium in main method"+cricket.stadium);
		
		System.out.println("***********");
		
		Cricket cricket1=new Cricket("Kohli",13,"Wankhede");
		System.out.println("The Cricketer name in main method:"+cricket1.name);
		System.out.println("The no of player  in main method:"+cricket1.noOfPlayer);
		System.out.println("The stadium in main method:"+cricket1.stadium);
		
	}
}