package com.overloading.app;

public class BackeryKiller {

	public static void main(String[] args) {
		
		System.out.println("invoking main in BackeryKiller");
		
		Backery backery = new Backery();
		backery.sell();
		backery.sell("cake");
		backery.sell(1234.0d);
		backery.sell(26);
		backery.sell("cake",1234.0d);
		backery.sell("cake",26,1234.0d);
		
		System.out.println("-----------------------------");
		
		Backery backery1 = new BackeryShop();
		backery1.sell();
		backery1.sell("pups");
		backery1.sell(3434.0d);
		backery1.sell(50);
		backery1.sell("pups",3434.0d);
		backery1.sell("pups",50,3434.0d);
		
	System.out.println("-----------------------------");
		
		Backery backery2= new BackeryShop();
		backery2.sell();
		backery2.sell("biscuits");
		backery2.sell(2344.0d);
		backery2.sell(14);
		backery2.sell("biscuits",2344.0d);
		backery2.sell("biscuits",14,2344.0d);
	}
	}


