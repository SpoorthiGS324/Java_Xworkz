package com.overloading.app;

public class MallKiller {

	public static void main(String[] args) {
		System.out.println("invoking main in MallKiller");
		
		Mall mall = new Mall();
		mall.shop();
		mall.shop("Ubicity");
		mall.shop("Ubicity",34);
		mall.shop(true);
		mall.shop("Ubicity",true);
		mall.shop(6);
		
		System.out.println("==============================");
		

		Mall mall1= new MallOrion();
		mall1.shop();
		mall1.shop("forum");
		mall1.shop("forum",24);
		mall1.shop(true);
		mall1.shop("forum",true);
		mall1.shop(3);
		
		System.out.println("==============================");
		

		Mall mall2 = new Mall();
		mall2.shop();
		mall2.shop("Rich");
		mall2.shop("Rich",24);
		mall2.shop(true);
		mall2.shop("rich",true);
		mall2.shop(7);
		
	}

}
