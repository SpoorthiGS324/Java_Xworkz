package com.overloading.app;

public class TempleKiller {

	public static void main(String[] args) {
		System.out.println("invoking main in TempleKiller");
		
		Temple temple = new Temple();
		temple.pooje();
		temple.pooje("Ganesha");
		temple.pooje("Ganesha","Bhadravathi");
		temple.pooje(11.00d);
		temple.pooje(11.00d,9.00d);
		temple.pooje("Ganesha",50.0d);
		
		System.out.println("=============================");
		
		
		Temple temple1 = new TempleHanuman();
		temple1.pooje();
		temple1.pooje("hanuman");
		temple1.pooje("hanuman","Bhadravathi");
		temple1.pooje(5.00d);
		temple1.pooje(5.00d,10.00d);
		temple1.pooje("hanuman",100.0d);
		

		System.out.println("=============================");
		
		
		TempleHanuman temple2 = new TempleHanuman();
		temple2.pooje();
		temple2.pooje("lakshmi");
		temple2.pooje("laksmi","Bhadravathi");
		temple2.pooje(6.00d);
		temple2.pooje(6.00d,12.00d);
		temple2.pooje("laksmi",50.0d);
		
		
	}

}
