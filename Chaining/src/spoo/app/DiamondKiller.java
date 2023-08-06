package spoo.app;

public class DiamondKiller {

	public static void main(String[] args) {
		System.out.println("Invoking main in DiamondKiller");
		Diamond diamond=new Diamond("Mahalakshmi","Vijayanagr",50999.89,20.4);
		System.out.println(diamond.shopeName);
		System.out.println(diamond.address);
		System.out.println(diamond.price);
		System.out.println(diamond.weight);
		
		System.out.println("---------------------------");
		DiamondPure diamondpure=new DiamondPure();
		System.out.println(diamondpure.shopeName);
		System.out.println(diamondpure.address);
		System.out.println(diamondpure.price);
		System.out.println(diamondpure.weight);
		
		System.out.println("---------------------------");
		DiamondPure diamondpure1=new DiamondPure("Shredevi","Jayanagar",60789.76,20.5);
		System.out.println(diamondpure1.shopeName);
		System.out.println(diamondpure1.address);
		System.out.println(diamondpure1.price);
		System.out.println(diamondpure1.weight);
	}

}
