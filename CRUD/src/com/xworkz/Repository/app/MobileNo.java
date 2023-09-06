package com.xworkz.Repository.app;

public interface MobileNo {

int TOTAL_ITEMS = 5;
	
	void store(long number);
	
	 default boolean IsExist(long number) {
		 
		return false;	
		
	 }

}
