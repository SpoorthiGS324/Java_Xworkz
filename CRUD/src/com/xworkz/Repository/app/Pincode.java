package com.xworkz.Repository.app;

public interface Pincode {

int TOTAL_ITEMS = 5;
	
	void store(int number);
	
	 default boolean IsExist(int number) {
		 
		return false;	
		
	 }
}
