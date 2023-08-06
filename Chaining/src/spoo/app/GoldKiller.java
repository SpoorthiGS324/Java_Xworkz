package spoo.app;

public class GoldKiller {

	public static void main(String[] args) {
		
		System.out.println("Invoking main in GoldKiller");
		Gold gold=new Gold("Ashok jewels",35000.55,"Bhadravathi",16.55);
		System.out.println(gold.shopName);
		System.out.println(gold.price);
		System.out.println(gold.location);
		System.out.println(gold.weight);
		
		System.out.println("-----------------------------");
		GoldPure goldpure=new GoldPure();
		System.out.println(goldpure.shopName);
		System.out.println(goldpure.price);
		System.out.println(goldpure.location);
		System.out.println(goldpure.weight);
		
		System.out.println("-----------------------------");
		GoldPure goldpure1=new GoldPure("Lakshmi jewels",40500.55,"Durga",14.5);
		System.out.println(goldpure1.shopName);
		System.out.println(goldpure1.price);
		System.out.println(goldpure1.location);
		System.out.println(goldpure1.weight);

	}
}


